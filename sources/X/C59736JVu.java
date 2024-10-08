package X;

/* renamed from: X.JVu  reason: case insensitive filesystem */
public final class C59736JVu implements C3495480u {
    public final int A00;
    public final Object A01;

    public C59736JVu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        int i;
        JYD jyd;
        C358088aL r0;
        Integer num;
        switch (this.A00) {
            case 2:
                W0T.A01((W0T) this.A01, 29, false, !((Boolean) obj).booleanValue(), false, false, false);
                return;
            case 3:
                i = ((Number) obj).intValue();
                jyd = (JYD) this.A01;
                AnonymousClass80V Atr = jyd.A0R.Atr();
                if (Atr == AnonymousClass80V.PRE_CAPTURE_AR_EFFECT_TRAY || Atr == AnonymousClass80V.CAPTURE) {
                    r0 = C358088aL.A0U;
                    break;
                } else {
                    return;
                }
                break;
            case 4:
                int intValue = ((Number) obj).intValue();
                JYD jyd2 = (JYD) this.A01;
                if (intValue == 0) {
                    Integer num2 = jyd2.A02;
                    Integer num3 = AnonymousClass05K.A00;
                    if (num2 != num3) {
                        jyd2.A02 = num3;
                        27p.A01(jyd2.A0H).A0o(2);
                        if (C357638Yz.A03(C358088aL.A0z, jyd2.A0J) && jyd2.A01 != C347087wF.A0I) {
                            JYD.A0E(jyd2, false);
                            C63809L7p A012 = JYD.A01(jyd2);
                            JYD.A0B(jyd2, (int) A012.A03, (int) A012.A00);
                            JYD.A0C(jyd2, jyd2.A01);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (intValue == 1 && jyd2.A02 != (num = AnonymousClass05K.A01)) {
                    jyd2.A02 = num;
                    27p.A01(jyd2.A0H).A0o(1);
                    if (C357638Yz.A03(C358088aL.A0z, jyd2.A0J) && jyd2.A01 != C347087wF.A0I) {
                        JYD.A0E(jyd2, false);
                        C63809L7p A013 = JYD.A01(jyd2);
                        JYD.A0B(jyd2, (int) A013.A03, (int) A013.A00);
                        JYD.A06(jyd2);
                        JYD.A0A(jyd2, 0);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 5:
                i = ((Number) obj).intValue();
                jyd = (JYD) this.A01;
                r0 = C358088aL.A10;
                break;
            default:
                0qQ.A0B(obj, 0);
                ((C249523jv) this.A01).FIG(obj);
                return;
        }
        JYD.A05(r0, jyd, i);
    }
}
