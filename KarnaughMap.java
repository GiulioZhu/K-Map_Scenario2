import java.util.Scanner;

public class KarnaughMap {

    private int NumR;
    private int NumC;
    private int[][] map;
    public KarnaughMap(int[][] map) {
        this.map = map;
        NumR = map.length;
        NumC = map[0].length;
    }
    public int[][] Group(int[][] map) {
        int numberof1 = Count1(map);
        int n = (int) (Math.log(numberof1) / Math.log(2)) + 2;
        int maxn = n;
        int numberofgroups = 1;
        int[][][] group = new int[10][NumR][NumC];
        boolean flag = true;
        for (int i = 0; i < NumR; i++) {
            for (int j = 0; j < NumC; j++) {
                for (int k = 0; k < 10; k++) {
                    group[k][i][j] = 0;
                    if (k == 0) {
                        group[k][i][j] = map[i][j];
                    }
                }

            }
        }

        while (n > 0) {
            for (int i = 0; i < NumR; i++) {
                for (int j = 0; j < NumC; j++) {
                    if (ifalone(group, NumR, NumC, maxn) && group[0][i][j] == 1) {
                        //check 1X1
                        if (n == 1) {
                            group[numberofgroups][i][j] = 1;
                            numberofgroups++;
                        }
                        //check 2X1
                        else if (n == 2) {
                            for (int k = 0; k < 4; k++) {
                                if (k == 0) {
                                    if (group[0][i][(j + 1) % 4] == 1) {
                                        group[numberofgroups][i][j] = 1;
                                        group[numberofgroups][i][(j + 1) % 4] = 1;
                                        numberofgroups++;
                                        break;
                                    }
                                } else if (k == 1) {
                                    if (group[0][(i + 1) % 4][j] == 1) {
                                        group[numberofgroups][i][j] = 1;
                                        group[numberofgroups][(i + 1) % 4][j] = 1;
                                        numberofgroups++;
                                    }

                                } else if (k == 2) {
                                    if (group[0][i][(j - 1) % 4] == 1) {
                                        group[numberofgroups][i][j] = 1;
                                        group[numberofgroups][i][(j - 1) % 4] = 1;
                                        numberofgroups++;
                                    }

                                } else {
                                    if (group[0][(i - 1) % 4][j] == 1) {
                                        group[numberofgroups][i][j] = 1;
                                        group[numberofgroups][(i - 1) % 4][j] = 1;
                                        numberofgroups++;
                                    }
                                }
                            }
                        }
                        //check 2X2
                        else if (n == 3) {
                            for (int k = 0; k < 4; k++) {
                                if (k == 0) {
                                    if (group[0][(i + 1) % 4][j] == 1 && group[0][i][(j + 1) % 4] == 1 && group[0][(i + 1) % 4][(j + 1) % 4] == 1) {
                                        group[numberofgroups][i][j] = 1;
                                        group[numberofgroups][(i + 1) % 4][j] = 1;
                                        group[numberofgroups][(i + 1) % 4][(j + 1) % 4] = 1;
                                        group[numberofgroups][i][(j + 1) % 4] = 1;
                                    }
                                } else if (k == 1) {
                                    if (group[0][(i + 1) % 4][j] == 1 && group[0][i][(j - 1) % 4] == 1 && group[0][(i + 1) % 4][(j - 1) % 4] == 1) {
                                        group[numberofgroups][i][j] = 1;
                                        group[numberofgroups][(i + 1) % 4][j] = 1;
                                        group[numberofgroups][(i + 1) % 4][(j - 1) % 4] = 1;
                                        group[numberofgroups][i][(j - 1) % 4] = 1;
                                    }
                                } else if (k == 2) {
                                    if (group[0][(i - 1) % 4][j] == 1 && group[0][i][(j - 1) % 4] == 1 && group[0][(i - 1) % 4][(j - 1) % 4] == 1) {
                                        group[numberofgroups][i][j] = 1;
                                        group[numberofgroups][(i - 1) % 4][j] = 1;
                                        group[numberofgroups][(i - 1) % 4][(j - 1) % 4] = 1;
                                        group[numberofgroups][i][(j - 1) % 4] = 1;
                                    }

                                } else {
                                    if (group[0][(i - 1) % 4][j] == 1 && group[0][i][(j + 1) % 4] == 1 && group[0][(i - 1) % 4][(j + 1) % 4] == 1) {
                                        group[numberofgroups][i][j] = 1;
                                        group[numberofgroups][(i - 1) % 4][j] = 1;
                                        group[numberofgroups][(i - 1) % 4][(j + 1) % 4] = 1;
                                        group[numberofgroups][i][(j + 1) % 4] = 1;
                                    }
                                }
                            }
                        }
                        //check 1X4
                        else if (n == 4) {
                            for (int k = 0; k < 4; k++) {
                                if (k == 0) {
                                    flag = true;
                                    for (int a = 0; a < 4; a++) {
                                        if (group[0][i][(j + a) % 4] != 1) {
                                            flag = false;
                                        }
                                    }
                                    if (flag) {
                                        group[numberofgroups][i][j] = 1;
                                        for (int a = 0; a < 4; a++) {
                                            group[numberofgroups][i][(j + a) % 4] = 1;
                                        }
                                        numberofgroups++;
                                    }
                                } else if (k == 1) {
                                    flag = true;
                                    for (int a = 0; a < 4; a++) {
                                        if (group[0][(i + a) % 4][j] != 1) {
                                            flag = false;
                                        }
                                    }
                                    if (flag) {
                                        group[numberofgroups][i][j] = 1;
                                        for (int a = 0; a < 4; a++) {
                                            group[numberofgroups][(i + a) % 4][j] = 1;
                                        }
                                        numberofgroups++;
                                    }
                                } else if (k == 2) {
                                    flag = true;
                                    for (int a = 0; a < 4; a++) {
                                        if (group[0][i][(j - a) % 4] != 1) {
                                            flag = false;
                                        }
                                    }
                                    if (flag) {
                                        group[numberofgroups][i][j] = 1;
                                        for (int a = 0; a < 4; a++) {
                                            group[numberofgroups][i][(j - a) % 4] = 1;
                                        }
                                        numberofgroups++;
                                    }
                                } else {
                                    flag = true;
                                    for (int a = 0; a < 4; a++) {
                                        if (group[0][(i - a) % 4][j] != 1) {
                                            flag = false;
                                        }
                                    }
                                    if (flag) {
                                        group[numberofgroups][i][j] = 1;
                                        for (int a = 0; a < 4; a++) {
                                            group[numberofgroups][(i - a) % 4][j] = 1;
                                        }
                                        numberofgroups++;
                                    }
                                }
                            }
                        }

                        //check 2X4
                        else if (n == 5) {
                            for (int k = 0; k < 8; k++) {
                                if (k == 0) {
                                    flag = true;
                                    for (int a = 0; a < 4; a++) {
                                        if (group[0][i][(j + a) % 4] != 1 || group[0][(i + 1) % 4][(j + a) % 4] != 1) {
                                            flag = false;
                                        }
                                    }
                                    if (flag) {
                                        group[numberofgroups][i][j] = 1;
                                        for (int a = 0; a < 4; a++) {
                                            group[numberofgroups][i][(j + a) % 4] = 1;
                                            group[numberofgroups][(i + 1) % 4][(j + a) % 4] = 1;
                                        }
                                        numberofgroups++;
                                    }
                                } else if (k == 1) {
                                    flag = true;
                                    for (int a = 0; a < 4; a++) {
                                        if (group[0][i][(j + a) % 4] != 1 || group[0][(i - 1) % 4][(j + a) % 4] != 1) {
                                            flag = false;
                                        }
                                    }
                                    if (flag) {
                                        group[numberofgroups][i][j] = 1;
                                        for (int a = 0; a < 4; a++) {
                                            group[numberofgroups][i][(j + a) % 4] = 1;
                                            group[numberofgroups][(i - 1) % 4][(j + a) % 4] = 1;
                                        }
                                        numberofgroups++;
                                    }
                                } else if (k == 2) {
                                    flag = true;
                                    for (int a = 0; a < 4; a++) {
                                        if (group[0][(i + a) % 4][(j + 1) % 4] != 1 || group[0][(i + a) % 4][j] != 1) {
                                            flag = false;
                                        }
                                    }
                                    if (flag) {
                                        group[numberofgroups][i][j] = 1;
                                        for (int a = 0; a < 4; a++) {
                                            group[numberofgroups][(i + a) % 4][(j + 1) % 4] = 1;
                                            group[numberofgroups][(i + a) % 4][j] = 1;
                                        }
                                        numberofgroups++;
                                    }
                                } else if (k == 3) {
                                    flag = true;
                                    for (int a = 0; a < 4; a++) {
                                        if (group[0][(i + a) % 4][(j - 1) % 4] != 1 || group[0][(i + a) % 4][j] != 1) {
                                            flag = false;
                                        }
                                    }
                                    if (flag) {
                                        group[numberofgroups][i][j] = 1;
                                        for (int a = 0; a < 4; a++) {
                                            group[numberofgroups][(i + a) % 4][(j - 1) % 4] = 1;
                                            group[numberofgroups][(i + a) % 4][j] = 1;
                                        }
                                        numberofgroups++;
                                    }
                                }
                                if (k == 4) {
                                    flag = true;
                                    for (int a = 0; a < 4; a++) {
                                        if (group[0][i][(j - a) % 4] != 1 || group[0][(i + 1) % 4][(j - a) % 4] != 1) {
                                            flag = false;
                                        }
                                    }
                                    if (flag) {
                                        group[numberofgroups][i][j] = 1;
                                        for (int a = 0; a < 4; a++) {
                                            group[numberofgroups][i][(j - a) % 4] = 1;
                                            group[numberofgroups][(i + 1) % 4][(j - a) % 4] = 1;
                                        }
                                        numberofgroups++;
                                    }
                                } else if (k == 5) {
                                    flag = true;
                                    for (int a = 0; a < 4; a++) {
                                        if (group[0][i][(j - a) % 4] != 1 || group[0][(i - 1) % 4][(j + a) % 4] != 1) {
                                            flag = false;
                                        }
                                    }
                                    if (flag) {
                                        group[numberofgroups][i][j] = 1;
                                        for (int a = 0; a < 4; a++) {
                                            group[numberofgroups][i][(j - a) % 4] = 1;
                                            group[numberofgroups][(i - 1) % 4][(j - a) % 4] = 1;
                                        }
                                        numberofgroups++;
                                    }
                                } else if (k == 6) {
                                    flag = true;
                                    for (int a = 0; a < 4; a++) {
                                        if (group[0][(i - a) % 4][(j + 1) % 4] != 1 || group[0][(i - a) % 4][j] != 1) {
                                            flag = false;
                                        }
                                    }
                                    if (flag) {
                                        group[numberofgroups][i][j] = 1;
                                        for (int a = 0; a < 4; a++) {
                                            group[numberofgroups][(i - a) % 4][(j + 1) % 4] = 1;
                                            group[numberofgroups][(i - a) % 4][j] = 1;
                                        }
                                        numberofgroups++;
                                    }
                                } else if (k == 7) {
                                    flag = true;
                                    for (int a = 0; a < 4; a++) {
                                        if (group[0][(i - a) % 4][(j - 1) % 4] != 1 || group[0][(i - a) % 4][j] != 1) {
                                            flag = false;
                                        }
                                    }
                                    if (flag) {
                                        group[numberofgroups][i][j] = 1;
                                        for (int a = 0; a < 4; a++) {
                                            group[numberofgroups][(i - a) % 4][(j - 1) % 4] = 1;
                                            group[numberofgroups][(i - a) % 4][j] = 1;
                                        }
                                        numberofgroups++;
                                    }
                                }

                            }
                        }
                        //check 4X4
                        else if (n == 6) {
                            flag = true;
                            for (int a = 0; a < 4; a++) {
                                for (int b = 0; b < 4; b++) {
                                    if (group[0][a][b] == 0) {
                                        flag = false;
                                    }
                                }
                            }
                            if (flag) {
                                for (int a = 0; a < 4; a++) {
                                    for (int b = 0; b < 4; b++) {
                                        group[numberofgroups][a][b] = 1;
                                    }
                                }
                                numberofgroups++;
                            }

                        }
                    }
                }
            }
            n--;


        }


    }

    private boolean ifalone(int[][][] groups, int row, int col, int n) {
        for (int k = 0; k < 10; k++) {
            if (groups[k][row][col] != 0) {
                return true;
            }
        }

        return false;
    }

    private int Count1(int[][] map) {
        int count = 0;
        for (int i = 0; i < NumR; i++) {
            for (int j = 0; j < NumC; j++) {
                if (map[i][j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {



    }
}
