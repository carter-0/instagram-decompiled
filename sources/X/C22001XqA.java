package X;

import java.net.ProtocolException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.XqA  reason: case insensitive filesystem */
public final class C22001XqA {
    public int A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final Xo0 A05;
    public final C13198TPe A06 = new Object();
    public final YCT A07;
    public final boolean A08;
    public final C13198TPe A09 = new Object();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.TPe] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.TPe] */
    public C22001XqA(Xo0 xo0, YCT yct) {
        if (yct != null) {
            this.A08 = true;
            this.A07 = yct;
            this.A05 = xo0;
            return;
        }
        throw AnonymousClass7TE.A11(Pxd.A00(885));
    }

    /* JADX INFO: finally extract failed */
    public static void A00(C22001XqA xqA) {
        String str;
        Y1F y1f;
        StringBuilder A1A;
        long j = xqA.A01;
        if (j > 0) {
            YCT yct = xqA.A07;
            C13198TPe tPe = xqA.A09;
            yct.E6S(tPe, j);
            if (!xqA.A08) {
                tPe.A0H((C12824T8t) null);
                throw AnonymousClass7TE.A11("seek");
            }
        }
        int i = xqA.A00;
        switch (i) {
            case 8:
                short s = 1005;
                C13198TPe tPe2 = xqA.A09;
                long j2 = tPe2.A00;
                if (j2 != 1) {
                    if (j2 != 0) {
                        s = tPe2.readShort();
                        str = tPe2.A05();
                        if (s < 1000 || s >= 5000) {
                            A1A = AnonymousClass7TE.A1A();
                            A1A.append("Code must be in range [1000,5000): ");
                            A1A.append(s);
                        } else if (s >= 1004 && (s <= 1006 || (s >= 1012 && s <= 2999))) {
                            A1A = AnonymousClass7TE.A1A();
                            A1A.append("Code ");
                            A1A.append(s);
                            A1A.append(" is reserved and may not be used.");
                        }
                        String obj = A1A.toString();
                        if (obj != null) {
                            throw new ProtocolException(obj);
                        }
                    } else {
                        str = "";
                    }
                    Xo0 xo0 = xqA.A05;
                    if (s != -1) {
                        synchronized (xo0) {
                            if (xo0.A00 == -1) {
                                xo0.A00 = s;
                                xo0.A04 = str;
                                y1f = null;
                                if (xo0.A0C && xo0.A0H.isEmpty()) {
                                    Y1F y1f2 = xo0.A08;
                                    xo0.A08 = null;
                                    ScheduledFuture scheduledFuture = xo0.A06;
                                    if (scheduledFuture != null) {
                                        scheduledFuture.cancel(false);
                                    }
                                    xo0.A05.shutdown();
                                    y1f = y1f2;
                                }
                            } else {
                                throw AnonymousClass7TE.A0z("already closed");
                            }
                        }
                        try {
                            XTa xTa = xo0.A0L;
                            if (y1f != null) {
                                Y7C y7c = (Y7C) xTa;
                                y7c.A00.scheduleCallback(new C22382Y1l(y7c), 0);
                            }
                            SUS.A09(y1f);
                            xqA.A02 = true;
                            return;
                        } catch (Throwable th) {
                            SUS.A09(y1f);
                            throw th;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
            case 9:
                Xo0 xo02 = xqA.A05;
                TAH A082 = xqA.A09.A08();
                synchronized (xo02) {
                    if (!xo02.A0D) {
                        if (!xo02.A0C || !xo02.A0H.isEmpty()) {
                            xo02.A0I.add(A082);
                            ScheduledExecutorService scheduledExecutorService = xo02.A05;
                            if (scheduledExecutorService != null) {
                                scheduledExecutorService.execute(xo02.A0F);
                            }
                            xo02.A01++;
                        }
                    }
                }
                return;
            case 10:
                Xo0 xo03 = xqA.A05;
                xqA.A09.A08();
                synchronized (xo03) {
                    xo03.A02++;
                    xo03.A0B = false;
                }
                return;
            default:
                throw C21055XCg.A0V("Unknown control opcode: ", Integer.toHexString(i));
        }
    }

    /* JADX INFO: finally extract failed */
    public static void A01(C22001XqA xqA) {
        String str;
        if (!xqA.A02) {
            YCT yct = xqA.A07;
            long A012 = yct.Ezn().A01();
            yct.Ezn().A03();
            try {
                int A002 = YCT.A00(yct);
                yct.Ezn().A05(TimeUnit.NANOSECONDS, A012);
                xqA.A00 = A002 & 15;
                boolean z = true;
                boolean A1P = AnonymousClass7TF.A1P(A002 & 128);
                xqA.A04 = A1P;
                boolean A1P2 = AnonymousClass7TF.A1P(A002 & 8);
                xqA.A03 = A1P2;
                if (!A1P2 || A1P) {
                    boolean A1P3 = AnonymousClass7TF.A1P(A002 & 64);
                    boolean A1P4 = AnonymousClass7TF.A1P(A002 & 32);
                    boolean A1P5 = AnonymousClass7TF.A1P(A002 & 16);
                    if (A1P3 || A1P4 || A1P5) {
                        throw new ProtocolException("Reserved flags are unsupported.");
                    }
                    int A003 = YCT.A00(yct);
                    if ((A003 & 128) == 0) {
                        z = false;
                    }
                    boolean z2 = xqA.A08;
                    if (z == z2) {
                        if (z2) {
                            str = "Server-sent frames must not be masked.";
                        } else {
                            str = "Client-sent frames must be masked.";
                        }
                        throw new ProtocolException(str);
                    }
                    long j = (long) (A003 & 127);
                    xqA.A01 = j;
                    if (j == 126) {
                        j = ((long) yct.readShort()) & 65535;
                        xqA.A01 = j;
                    } else if (j == 127) {
                        j = yct.readLong();
                        xqA.A01 = j;
                        if (j < 0) {
                            throw new ProtocolException(002.A0g("Frame length 0x", Long.toHexString(j), " > 0x7FFFFFFFFFFFFFFF"));
                        }
                    }
                    if (xqA.A03 && j > 125) {
                        throw new ProtocolException("Control frame must be less than 125B.");
                    } else if (z) {
                        yct.readFully((byte[]) null);
                    }
                } else {
                    throw new ProtocolException("Control frames must be final.");
                }
            } catch (Throwable th) {
                yct.Ezn().A05(TimeUnit.NANOSECONDS, A012);
                throw th;
            }
        } else {
            throw C21055XCg.A0H();
        }
    }
}
