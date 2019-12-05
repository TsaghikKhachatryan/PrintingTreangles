package com.company;

public class Square {

    /////////////////////////////////////////////////////////PRINTING FULL TRIANGLES
    public static void printFullA(int len) {
        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < len - i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printFullB(int len) {
        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < len; ++j) {
                if (j > i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printFullC(int len) {
        for (int i = len; i > 0; --i) {
            for (int j = 0; j <= len - i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printFullD(int len) {
        for (int i = len; i > 0; --i) {
            for (int j = 0; j < len; ++j) {
                if (j >= i)
                    System.out.print("* ");
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printFullE(int len) {
        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < len; ++j) {
                if (j > i) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printFullF(int len) {
        for (int i = len; i > 0; --i) {
            for (int j = 0; j < len; ++j) {
                if (j >= i)
                    System.out.print("* ");
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printFullH(int len) {
        for (int i = 0; i <= len; ++i) {
            for (int j = 0; j < len; ++j) {
                if (i <= len / 2) {
                    if (j <= i) {
                        System.out.print(" *");
                    }
                } else {
                    if (j <= len - i) {
                        System.out.print(" *");
                    }
                }
            }
            System.out.println();

        }
    }

    ///////////////////////////////////////////////////////////////////PRINTING EMPTY TRIANGLES
    public static void printEmptyA(int len) {
        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < len; ++j) {
                if (i == 0 || j == 0 || j == len - i - 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printEmptyB(int len) {
        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < len; ++j) {
                if (i == 0 || j == len - 1 || j == i) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printEmptyC(int len) {
        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < len; ++j) {
                if (i == len - 1 || j == 0 || j == i) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printEmptyD(int len) {
        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < len; ++j) {
                if (i == len - 1 || j == len - 1 || j == len - i - 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
