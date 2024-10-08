package X;

import android.content.Context;
import android.os.Bundle;

/* renamed from: X.S4u  reason: case insensitive filesystem */
public final class C11000S4u {
    public final Context A00;
    public final C10551Ru5 A01;
    public final C10405Rrh A02;
    public final S1A A03;
    public final SHY A04;
    public final C11183SEj A05;

    public C11000S4u(Context context, RRG rrg, C13712Tfa tfa) {
        S1A s1a = new S1A(tfa);
        SHY shy = new SHY(tfa, s1a.A01);
        C10405Rrh rrh = new C10405Rrh();
        this.A00 = context;
        this.A01 = new C10551Ru5(rrg);
        this.A03 = s1a;
        this.A04 = shy;
        shy.A00 = new TC1(this);
        this.A02 = rrh;
        this.A05 = new C11183SEj(tfa, this);
    }

    public final void A00() {
        C13425TaB soN;
        C13425TaB taB;
        int intValue;
        C8991RKj rKj;
        C10932S1k A002 = C9272RVx.A00(this.A00);
        if (A002.A01 || A002.A02) {
            if (A002.A02) {
                soN = new C7617QQh(RFF.INTERNAL_UNRECOVERABLE, this);
            } else {
                soN = new C12172SoN(this);
            }
            A01(soN);
            return;
        }
        C11183SEj sEj = this.A05;
        try {
            C11000S4u s4u = sEj.A02;
            C10551Ru5 ru5 = s4u.A01;
            C10550Ru4 ru4 = ru5.A00;
            if (ru4 == null) {
                SO5 so5 = sEj.A00;
                String A003 = ru5.A02.A00();
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putString("package_name", A003);
                Bundle A004 = SO5.A00(A0a, so5, "get_install_data");
                ru4 = new C10550Ru4((String) RW1.A00(A004, String.class, "version_name"), Pxe.A09(RW1.A00(A004, Integer.class, "version_code")), ((Long) RW1.A00(A004, Long.class, "total_download_size_bytes")).longValue());
                ru5.A00 = ru4;
            }
            C10739RxI A022 = sEj.A00.A02(ru5.A02.A00());
            if (!ru5.A01 || !((intValue = A022.A04.intValue()) == 6 || intValue == 8)) {
                ru5.A01 = false;
                switch (A022.A04.intValue()) {
                    case 0:
                    case 1:
                        taB = new C7618QQi(ru4, s4u);
                        break;
                    case 2:
                        taB = new C12172SoN(s4u);
                        break;
                    case 3:
                        taB = new C7626QQs(A022, s4u);
                        break;
                    case 4:
                        taB = new C12172SoN(s4u);
                        break;
                    case 5:
                        taB = new C12172SoN(s4u);
                        break;
                    case 6:
                        taB = new C7618QQi(ru4, s4u);
                        break;
                    case 7:
                        taB = new C12172SoN(s4u);
                        break;
                    case 8:
                        taB = new QQo(A022.A02, ru4, s4u);
                        break;
                    default:
                        taB = new C7617QQh(RFF.INTERNAL_UNRECOVERABLE, s4u);
                        break;
                }
            } else {
                taB = new C7618QQi(ru4, s4u);
            }
            s4u.A01(taB);
            return;
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            rKj = new C8991RKj(RFF.INTERNAL_UNRECOVERABLE, e);
        } catch (IllegalStateException e2) {
            rKj = new C8991RKj(RFF.UNKNOWN, (Throwable) e2);
        } catch (C8991RKj e3) {
            throw e3;
        } catch (Exception e4) {
            rKj = new C8991RKj(RFF.UNKNOWN, (Throwable) e4);
        } catch (C8991RKj e5) {
            sEj.A01.Ew3("OxygenInstallSDK_UNEXPECTED_STATE_EXCEPTION", e5);
            sEj.A02.A01(C11183SEj.A00(e5, sEj));
            return;
        }
        throw rKj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if ((r3.A00 instanceof X.C13945Tlr) != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C13425TaB r5) {
        /*
            r4 = this;
            X.Rrh r3 = r4.A02
            if (r5 == 0) goto L_0x002f
            X.TaB r0 = r3.A00
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002f
        L_0x000c:
            boolean r0 = r5 instanceof X.C7620QQk
            if (r0 == 0) goto L_0x0015
            java.util.Set r0 = r3.A01
            r0.clear()
        L_0x0015:
            X.SHY r2 = r4.A04
            java.util.Set r0 = r3.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0026
            X.TaB r0 = r3.A00
            boolean r1 = r0 instanceof X.C13945Tlr
            r0 = 1
            if (r1 == 0) goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            boolean r0 = X.C66581MXm.A1a(r0)
            r2.A01(r0)
            return
        L_0x002f:
            r3.A00 = r5
            if (r5 == 0) goto L_0x000c
            java.util.Set r0 = r3.A01
            java.util.Iterator r1 = r0.iterator()
        L_0x0039:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r1.next()
            X.KzP r0 = (X.C63576KzP) r0
            X.3pV r0 = r0.A00
            r0.FIG(r5)
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11000S4u.A01(X.TaB):void");
    }
}
