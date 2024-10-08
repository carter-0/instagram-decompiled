package X;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: X.9CF  reason: invalid class name */
public final class AnonymousClass9CF {
    public int A00;
    public int A01 = 0;
    public int A02;
    public final AnonymousClass97U A03;

    public final void A04(List list) {
        int A0E;
        int i = this.A02 & 7;
        if (i == 0) {
            do {
                AnonymousClass97U r1 = this.A03;
                list.add(Boolean.valueOf(r1.A0R()));
                if (!r1.A0Q()) {
                    A0E = r1.A0E();
                } else {
                    return;
                }
            } while (A0E == this.A02);
            this.A01 = A0E;
        } else if (i == 2) {
            AnonymousClass97U r2 = this.A03;
            int A08 = r2.A08() + r2.A0F();
            do {
                list.add(Boolean.valueOf(r2.A0R()));
            } while (r2.A08() < A08);
            A00(A08);
        } else {
            throw AnonymousClass9GO.A00();
        }
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    public final void A05(List list) {
        int A0E;
        int i = this.A02 & 7;
        if (i == 1) {
            do {
                AnonymousClass97U r2 = this.A03;
                list.add(Double.valueOf(r2.A06()));
                if (!r2.A0Q()) {
                    A0E = r2.A0E();
                } else {
                    return;
                }
            } while (A0E == this.A02);
            this.A01 = A0E;
        } else if (i == 2) {
            AnonymousClass97U r3 = this.A03;
            int A0F = r3.A0F();
            if ((A0F & 7) == 0) {
                int A08 = r3.A08() + A0F;
                do {
                    list.add(Double.valueOf(r3.A06()));
                } while (r3.A08() < A08);
                return;
            }
            ? iOException = new IOException("Failed to parse the message.");
            iOException.A00 = null;
            throw iOException;
        } else {
            throw AnonymousClass9GO.A00();
        }
    }

    public final void A06(List list) {
        int A0E;
        int i = this.A02 & 7;
        if (i == 0) {
            do {
                AnonymousClass97U r1 = this.A03;
                list.add(Integer.valueOf(r1.A09()));
                if (!r1.A0Q()) {
                    A0E = r1.A0E();
                } else {
                    return;
                }
            } while (A0E == this.A02);
            this.A01 = A0E;
        } else if (i == 2) {
            AnonymousClass97U r2 = this.A03;
            int A08 = r2.A08() + r2.A0F();
            do {
                list.add(Integer.valueOf(r2.A09()));
            } while (r2.A08() < A08);
            A00(A08);
        } else {
            throw AnonymousClass9GO.A00();
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    public final void A07(List list) {
        int A0E;
        int i = this.A02 & 7;
        if (i == 2) {
            AnonymousClass97U r3 = this.A03;
            int A0F = r3.A0F();
            if ((A0F & 3) == 0) {
                int A08 = r3.A08() + A0F;
                do {
                    list.add(Integer.valueOf(r3.A0A()));
                } while (r3.A08() < A08);
                return;
            }
            ? iOException = new IOException("Failed to parse the message.");
            iOException.A00 = null;
            throw iOException;
        } else if (i != 5) {
            throw AnonymousClass9GO.A00();
        } else {
            do {
                AnonymousClass97U r1 = this.A03;
                list.add(Integer.valueOf(r1.A0A()));
                if (!r1.A0Q()) {
                    A0E = r1.A0E();
                } else {
                    return;
                }
            } while (A0E == this.A02);
            this.A01 = A0E;
        }
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    public final void A08(List list) {
        int A0E;
        int i = this.A02 & 7;
        if (i == 1) {
            do {
                AnonymousClass97U r2 = this.A03;
                list.add(Long.valueOf(r2.A0H()));
                if (!r2.A0Q()) {
                    A0E = r2.A0E();
                } else {
                    return;
                }
            } while (A0E == this.A02);
            this.A01 = A0E;
        } else if (i == 2) {
            AnonymousClass97U r3 = this.A03;
            int A0F = r3.A0F();
            if ((A0F & 7) == 0) {
                int A08 = r3.A08() + A0F;
                do {
                    list.add(Long.valueOf(r3.A0H()));
                } while (r3.A08() < A08);
                return;
            }
            ? iOException = new IOException("Failed to parse the message.");
            iOException.A00 = null;
            throw iOException;
        } else {
            throw AnonymousClass9GO.A00();
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    public final void A09(List list) {
        int A0E;
        int i = this.A02 & 7;
        if (i == 2) {
            AnonymousClass97U r3 = this.A03;
            int A0F = r3.A0F();
            if ((A0F & 3) == 0) {
                int A08 = r3.A08() + A0F;
                do {
                    list.add(Float.valueOf(r3.A07()));
                } while (r3.A08() < A08);
                return;
            }
            ? iOException = new IOException("Failed to parse the message.");
            iOException.A00 = null;
            throw iOException;
        } else if (i != 5) {
            throw AnonymousClass9GO.A00();
        } else {
            do {
                AnonymousClass97U r1 = this.A03;
                list.add(Float.valueOf(r1.A07()));
                if (!r1.A0Q()) {
                    A0E = r1.A0E();
                } else {
                    return;
                }
            } while (A0E == this.A02);
            this.A01 = A0E;
        }
    }

    public final void A0A(List list) {
        int A0E;
        int i = this.A02 & 7;
        if (i == 0) {
            do {
                AnonymousClass97U r1 = this.A03;
                list.add(Integer.valueOf(r1.A0B()));
                if (!r1.A0Q()) {
                    A0E = r1.A0E();
                } else {
                    return;
                }
            } while (A0E == this.A02);
            this.A01 = A0E;
        } else if (i == 2) {
            AnonymousClass97U r2 = this.A03;
            int A08 = r2.A08() + r2.A0F();
            do {
                list.add(Integer.valueOf(r2.A0B()));
            } while (r2.A08() < A08);
            A00(A08);
        } else {
            throw AnonymousClass9GO.A00();
        }
    }

    public final void A0B(List list) {
        int A0E;
        int i = this.A02 & 7;
        if (i == 0) {
            do {
                AnonymousClass97U r2 = this.A03;
                list.add(Long.valueOf(r2.A0I()));
                if (!r2.A0Q()) {
                    A0E = r2.A0E();
                } else {
                    return;
                }
            } while (A0E == this.A02);
            this.A01 = A0E;
        } else if (i == 2) {
            AnonymousClass97U r3 = this.A03;
            int A08 = r3.A08() + r3.A0F();
            do {
                list.add(Long.valueOf(r3.A0I()));
            } while (r3.A08() < A08);
            A00(A08);
        } else {
            throw AnonymousClass9GO.A00();
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    public final void A0C(List list) {
        int A0E;
        int i = this.A02 & 7;
        if (i == 2) {
            AnonymousClass97U r3 = this.A03;
            int A0F = r3.A0F();
            if ((A0F & 3) == 0) {
                int A08 = r3.A08() + A0F;
                do {
                    list.add(Integer.valueOf(r3.A0C()));
                } while (r3.A08() < A08);
                return;
            }
            ? iOException = new IOException("Failed to parse the message.");
            iOException.A00 = null;
            throw iOException;
        } else if (i != 5) {
            throw AnonymousClass9GO.A00();
        } else {
            do {
                AnonymousClass97U r1 = this.A03;
                list.add(Integer.valueOf(r1.A0C()));
                if (!r1.A0Q()) {
                    A0E = r1.A0E();
                } else {
                    return;
                }
            } while (A0E == this.A02);
            this.A01 = A0E;
        }
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    public final void A0D(List list) {
        int A0E;
        int i = this.A02 & 7;
        if (i == 1) {
            do {
                AnonymousClass97U r2 = this.A03;
                list.add(Long.valueOf(r2.A0J()));
                if (!r2.A0Q()) {
                    A0E = r2.A0E();
                } else {
                    return;
                }
            } while (A0E == this.A02);
            this.A01 = A0E;
        } else if (i == 2) {
            AnonymousClass97U r3 = this.A03;
            int A0F = r3.A0F();
            if ((A0F & 7) == 0) {
                int A08 = r3.A08() + A0F;
                do {
                    list.add(Long.valueOf(r3.A0J()));
                } while (r3.A08() < A08);
                return;
            }
            ? iOException = new IOException("Failed to parse the message.");
            iOException.A00 = null;
            throw iOException;
        } else {
            throw AnonymousClass9GO.A00();
        }
    }

    public final void A0E(List list) {
        int A0E;
        int i = this.A02 & 7;
        if (i == 0) {
            do {
                AnonymousClass97U r1 = this.A03;
                list.add(Integer.valueOf(r1.A0D()));
                if (!r1.A0Q()) {
                    A0E = r1.A0E();
                } else {
                    return;
                }
            } while (A0E == this.A02);
            this.A01 = A0E;
        } else if (i == 2) {
            AnonymousClass97U r2 = this.A03;
            int A08 = r2.A08() + r2.A0F();
            do {
                list.add(Integer.valueOf(r2.A0D()));
            } while (r2.A08() < A08);
            A00(A08);
        } else {
            throw AnonymousClass9GO.A00();
        }
    }

    public final void A0F(List list) {
        int A0E;
        int i = this.A02 & 7;
        if (i == 0) {
            do {
                AnonymousClass97U r2 = this.A03;
                list.add(Long.valueOf(r2.A0K()));
                if (!r2.A0Q()) {
                    A0E = r2.A0E();
                } else {
                    return;
                }
            } while (A0E == this.A02);
            this.A01 = A0E;
        } else if (i == 2) {
            AnonymousClass97U r3 = this.A03;
            int A08 = r3.A08() + r3.A0F();
            do {
                list.add(Long.valueOf(r3.A0K()));
            } while (r3.A08() < A08);
            A00(A08);
        } else {
            throw AnonymousClass9GO.A00();
        }
    }

    public final void A0G(List list) {
        int A0E;
        int i = this.A02 & 7;
        if (i == 0) {
            do {
                AnonymousClass97U r1 = this.A03;
                list.add(Integer.valueOf(r1.A0F()));
                if (!r1.A0Q()) {
                    A0E = r1.A0E();
                } else {
                    return;
                }
            } while (A0E == this.A02);
            this.A01 = A0E;
        } else if (i == 2) {
            AnonymousClass97U r2 = this.A03;
            int A08 = r2.A08() + r2.A0F();
            do {
                list.add(Integer.valueOf(r2.A0F()));
            } while (r2.A08() < A08);
            A00(A08);
        } else {
            throw AnonymousClass9GO.A00();
        }
    }

    public final void A0H(List list) {
        int A0E;
        int i = this.A02 & 7;
        if (i == 0) {
            do {
                AnonymousClass97U r2 = this.A03;
                list.add(Long.valueOf(r2.A0L()));
                if (!r2.A0Q()) {
                    A0E = r2.A0E();
                } else {
                    return;
                }
            } while (A0E == this.A02);
            this.A01 = A0E;
        } else if (i == 2) {
            AnonymousClass97U r3 = this.A03;
            int A08 = r3.A08() + r3.A0F();
            do {
                list.add(Long.valueOf(r3.A0L()));
            } while (r3.A08() < A08);
            A00(A08);
        } else {
            throw AnonymousClass9GO.A00();
        }
    }

    private void A00(int i) {
        if (this.A03.A08() != i) {
            throw AnonymousClass9GO.A01();
        }
    }

    public static void A01(AnonymousClass9CF r0, int i) {
        if ((r0.A02 & 7) != i) {
            throw AnonymousClass9GO.A00();
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    public static void A02(AnonymousClass9CF r3, C3738397d r4, C374899Bg r5, Object obj) {
        int i = r3.A00;
        r3.A00 = ((r3.A02 >>> 3) << 3) | 4;
        try {
            r5.Co7(r3, r4, obj);
            if (r3.A02 != r3.A00) {
                ? iOException = new IOException("Failed to parse the message.");
                iOException.A00 = null;
                throw iOException;
            }
        } finally {
            r3.A00 = i;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    public static void A03(AnonymousClass9CF r4, C3738397d r5, C374899Bg r6, Object obj) {
        AnonymousClass97U r3 = r4.A03;
        int A0F = r3.A0F();
        int i = r3.A00;
        if (i < 100) {
            int A0G = r3.A0G(A0F);
            r3.A00 = i + 1;
            r6.Co7(r4, r5, obj);
            r3.A0P();
            r3.A00--;
            if (r3 instanceof AnonymousClass9BY) {
                AnonymousClass9BY r32 = (AnonymousClass9BY) r3;
                r32.A01 = A0G;
                AnonymousClass9BY.A01(r32);
                return;
            }
            AnonymousClass97T r33 = (AnonymousClass97T) r3;
            r33.A00 = A0G;
            AnonymousClass97T.A00(r33);
            return;
        }
        ? iOException = new IOException(C273654mx.A00(494));
        iOException.A00 = null;
        throw iOException;
    }

    public AnonymousClass9CF(AnonymousClass97U r2) {
        Charset charset = AnonymousClass97S.A04;
        this.A03 = r2;
        r2.A01 = this;
    }
}
