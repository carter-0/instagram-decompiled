package X;

import com.instagram.react.modules.base.IgReactQEModule;
import java.lang.ref.WeakReference;

/* renamed from: X.IUb  reason: case insensitive filesystem */
public final class C57240IUb implements AnonymousClass2xU {
    public final int A00;
    public final Object A01;

    public C57240IUb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DQp(AnonymousClass3W1 r13, int i) {
        C289495dh r6;
        2Wa r2;
        Object obj;
        boolean z;
        switch (this.A00) {
            case 0:
                0qQ.A0B(r13, 0);
                if (i == 4) {
                    ((2Wa) this.A01).A03(new J6H(r13, 12));
                    return;
                }
                return;
            case 1:
                0qQ.A0B(r13, 0);
                if (i == 4) {
                    C289485df r4 = (C289485df) C51966G9m.A17(this.A01);
                    int i2 = r13.A02;
                    C289495dh r3 = r4.A02;
                    if (r3.BI6() != i2) {
                        if (r4.A07) {
                            C289495dh r7 = r4.A04;
                            int i3 = 0;
                            if (i2 > r7.BI6()) {
                                int i4 = r4.A01 - 1;
                                int i5 = i2;
                                if (i2 > i4) {
                                    i5 = i4;
                                }
                                r7.EZz(i5);
                                r6 = r4.A06;
                                r6.EZz(Math.max(0, (r7.BI6() - 5) + 1));
                            } else {
                                r6 = r4.A06;
                                if (i2 < r6.BI6()) {
                                    int i6 = i2;
                                    if (i2 < 0) {
                                        i6 = 0;
                                    }
                                    r6.EZz(i6);
                                    r7.EZz(Math.min((r6.BI6() + 5) - 1, r4.A01 - 1));
                                }
                            }
                            C289495dh r9 = r4.A05;
                            r9.EZz(Math.max(0, r6.BI6() - 2));
                            C289495dh r10 = r4.A03;
                            r10.EZz(Math.min(r7.BI6() + 2, r4.A01 - 1));
                            if (!(r6.BI6() == r9.BI6() || r7.BI6() == r10.BI6())) {
                                if (i2 > r3.BI6()) {
                                    if (i2 == r7.BI6() && r10.BI6() - i2 == 2) {
                                        i3 = 1;
                                    }
                                } else if (i2 == r6.BI6() && i2 - r9.BI6() == 2) {
                                    i3 = -1;
                                }
                            }
                            r4.A00 = i3;
                        }
                        r3.EZz(i2);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                0qQ.A0B(r13, 0);
                ((AnonymousClass3Ux) this.A01).DQp(r13, i);
                return;
            case 3:
                0qQ.A0B(r13, 0);
                if (i == 10) {
                    C51967G9n.A1B((2V5) this.A01, r13.A1z);
                    return;
                }
                return;
            case 4:
                0qQ.A0B(r13, 0);
                if (i == 42) {
                    r2 = (2Wa) this.A01;
                    WeakReference weakReference = r13.A1Y;
                    if (weakReference == null) {
                        obj = null;
                        break;
                    } else {
                        obj = weakReference.get();
                        break;
                    }
                } else {
                    return;
                }
            case 5:
                if (i == 63) {
                    r2 = (2Wa) this.A01;
                    obj = Long.valueOf(((C52204GIv) C52204GIv.A02.getValue()).A00());
                    break;
                } else {
                    return;
                }
            case 6:
                0qQ.A0B(r13, 0);
                if (i == 5) {
                    r2 = (2Wa) this.A01;
                    z = r13.A29;
                    break;
                } else {
                    return;
                }
            case 7:
                0qQ.A0B(r13, 0);
                if (i == 33) {
                    r2 = (2Wa) this.A01;
                    z = r13.A2B;
                    break;
                } else {
                    return;
                }
            case 8:
                z = false;
                0qQ.A0B(r13, 0);
                if (i == 29) {
                    Integer num = r13.A10;
                    Integer num2 = AnonymousClass05K.A00;
                    r2 = (2Wa) this.A01;
                    if (num != num2) {
                        z = true;
                        break;
                    }
                } else {
                    return;
                }
                break;
            case 9:
                0qQ.A0B(r13, 0);
                r2 = (2Wa) this.A01;
                if (r2.A03 != null && i == 46) {
                    obj = Float.valueOf(C51970G9q.A01(r13.A1q ? 1 : 0));
                    break;
                } else {
                    return;
                }
                break;
            case 10:
                0qQ.A0B(r13, 0);
                if (i == 49) {
                    r2 = (2Wa) this.A01;
                    z = r13.A2A;
                    break;
                } else {
                    return;
                }
            case 11:
                0qQ.A0B(r13, 0);
                if (i == 65) {
                    r2 = (2Wa) this.A01;
                    z = r13.A25;
                    break;
                } else {
                    return;
                }
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                0qQ.A0B(r13, 0);
                if (i == 61) {
                    r2 = (2Wa) this.A01;
                    obj = r13.A3R.A00;
                    break;
                } else {
                    return;
                }
            case 13:
                0qQ.A0B(r13, 0);
                if (i == 18) {
                    r2 = (2Wa) this.A01;
                    z = r13.A1w;
                    break;
                } else {
                    return;
                }
            case 14:
                0qQ.A0B(r13, 0);
                if (i == 73) {
                    r2 = (2Wa) this.A01;
                    obj = r13.A0n;
                    break;
                } else {
                    return;
                }
            default:
                0qQ.A0B(r13, 0);
                if (i == 73) {
                    GJF gjf = r13.A0n;
                    GJF gjf2 = GJF.ANCHORED;
                    GDS gds = (GDS) this.A01;
                    if (gjf == gjf2) {
                        gds.A0G.A0E();
                        return;
                    } else if (gds.A0I) {
                        gds.A0G.A0F();
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
        obj = Boolean.valueOf(z);
        r2.A01(obj);
    }
}
