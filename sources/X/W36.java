package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class W36 {
    public boolean A00;
    public boolean A01;
    public final AtomicBoolean A02 = JTQ.A0k();

    public static JSONObject A07(JSONArray jSONArray) {
        JSONObject jSONObject = jSONArray.getJSONObject(jSONArray.length() - 1);
        jSONObject.put("end_time_ms", -1);
        return jSONObject;
    }

    public final synchronized void A0F(boolean z) {
        this.A00 = z;
    }

    public final synchronized void A0G(boolean z) {
        Object obj;
        AnonymousClass0eM r0;
        if (z) {
            if (this.A02.get()) {
                A09();
            }
            if (this instanceof UUN) {
                UUN uun = (UUN) this;
                JSONObject jSONObject = uun.A06;
                if (jSONObject != null) {
                    uun.A02.put(jSONObject);
                }
                JSONObject jSONObject2 = uun.A08;
                if (jSONObject2 != null) {
                    uun.A04.put(jSONObject2);
                }
                JSONObject jSONObject3 = uun.A05;
                if (jSONObject3 != null) {
                    uun.A01.put(jSONObject3);
                }
                JSONObject jSONObject4 = uun.A07;
                if (jSONObject4 != null) {
                    uun.A03.put(jSONObject4);
                }
            } else {
                UUM uum = (UUM) this;
                if (uum.A00 == 4) {
                    C14941UGe uGe = uum.A02;
                    if (uGe != null) {
                        C13990Tnq.A1P(uGe, uum.A0A);
                    }
                    C14944UGh uGh = uum.A04;
                    if (uGh != null) {
                        C13990Tnq.A1P(uGh, uum.A0E);
                    }
                    C14940UGd uGd = uum.A01;
                    if (uGd != null) {
                        C13990Tnq.A1P(uGd, uum.A09);
                    }
                    obj = uum.A03;
                    if (obj != null) {
                        r0 = uum.A0D;
                    }
                } else {
                    C14948UGl uGl = uum.A06;
                    if (uGl != null) {
                        C13990Tnq.A1P(uGl, uum.A0C);
                    }
                    C14951UGo uGo = uum.A08;
                    if (uGo != null) {
                        C13990Tnq.A1P(uGo, uum.A0G);
                    }
                    C14947UGk uGk = uum.A05;
                    if (uGk != null) {
                        C13990Tnq.A1P(uGk, uum.A0B);
                    }
                    obj = uum.A07;
                    if (obj != null) {
                        r0 = uum.A0F;
                    }
                }
                C13990Tnq.A1P(obj, r0);
            }
        } else {
            this.A02.set(true);
        }
        this.A01 = z;
    }

    public final synchronized boolean A0H() {
        return this.A01;
    }

    public static Long A03(0bb r2, UL4 ul4, long j) {
        r2.A05("sample_rate", Long.valueOf((long) ul4.A02));
        r2.A05(TraceFieldType.Bitrate, Long.valueOf((long) ul4.A00));
        r2.A05("channels", Long.valueOf((long) ul4.A01));
        r2.A06("codec_profile", C16805V6m.A00(ul4.A04));
        Long valueOf = Long.valueOf(j);
        r2.A05("start_time_ms", valueOf);
        return valueOf;
    }

    public static Long A04(0bb r2, ULY uly, long j) {
        r2.A05(TraceFieldType.Bitrate, Long.valueOf((long) uly.A00));
        Long valueOf = Long.valueOf(j);
        r2.A05("start_time_ms", valueOf);
        return valueOf;
    }

    public static String A06(0bb r2) {
        r2.A05("end_time_ms", -1L);
        return "end_time_ms";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.UUM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.UUN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.UUM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: X.UUM} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09() {
        /*
            r2 = this;
            boolean r0 = r2 instanceof X.UUN
            if (r0 == 0) goto L_0x002a
            r1 = r2
            X.UUN r1 = (X.UUN) r1
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            r1.A02 = r0
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            r1.A04 = r0
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            r1.A01 = r0
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            r1.A03 = r0
        L_0x0023:
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.A02
            r0 = 0
            r1.set(r0)
            return
        L_0x002a:
            r1 = r2
            X.UUM r1 = (X.UUM) r1
            X.0eM r0 = r1.A0C
            A08(r0)
            X.0eM r0 = r1.A0G
            A08(r0)
            X.0eM r0 = r1.A0B
            A08(r0)
            X.0eM r0 = r1.A0F
            A08(r0)
            X.0eM r0 = r1.A0A
            A08(r0)
            X.0eM r0 = r1.A0E
            A08(r0)
            X.0eM r0 = r1.A09
            A08(r0)
            X.0eM r0 = r1.A0D
            A08(r0)
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W36.A09():void");
    }

    public final void A0A() {
        if (this instanceof UUN) {
            UUN uun = (UUN) this;
            JSONArray jSONArray = uun.A02;
            if (AnonymousClass7TF.A1R(jSONArray.length())) {
                uun.A06 = A07(jSONArray);
            } else {
                uun.A06 = null;
            }
            JSONArray jSONArray2 = uun.A04;
            if (jSONArray2.length() > 0) {
                uun.A08 = A07(jSONArray2);
            } else {
                uun.A08 = null;
            }
            JSONArray jSONArray3 = uun.A01;
            if (jSONArray3.length() > 0) {
                uun.A05 = A07(jSONArray3);
            } else {
                uun.A05 = null;
            }
            JSONArray jSONArray4 = uun.A03;
            if (jSONArray4.length() > 0) {
                uun.A07 = A07(jSONArray4);
            } else {
                uun.A07 = null;
            }
            uun.A09();
            return;
        }
        UUM uum = (UUM) this;
        synchronized (uum) {
            C14948UGl uGl = (C14948UGl) A05(uum.A0C);
            C14943UGg uGg = null;
            if (uGl != null) {
                C13990Tnq.A14(uGl, -1);
            } else {
                uGl = null;
            }
            uum.A06 = uGl;
            C14951UGo uGo = (C14951UGo) A05(uum.A0G);
            if (uGo != null) {
                C13990Tnq.A14(uGo, -1);
            } else {
                uGo = null;
            }
            uum.A08 = uGo;
            C14947UGk uGk = (C14947UGk) A05(uum.A0B);
            if (uGk != null) {
                C13990Tnq.A14(uGk, -1);
            } else {
                uGk = null;
            }
            uum.A05 = uGk;
            C14950UGn uGn = (C14950UGn) A05(uum.A0F);
            if (uGn != null) {
                C13990Tnq.A14(uGn, -1);
            } else {
                uGn = null;
            }
            uum.A07 = uGn;
            C14941UGe uGe = (C14941UGe) A05(uum.A0A);
            if (uGe != null) {
                C13990Tnq.A14(uGe, -1);
            } else {
                uGe = null;
            }
            uum.A02 = uGe;
            C14944UGh uGh = (C14944UGh) A05(uum.A0E);
            if (uGh != null) {
                C13990Tnq.A14(uGh, -1);
            } else {
                uGh = null;
            }
            uum.A04 = uGh;
            C14940UGd uGd = (C14940UGd) A05(uum.A09);
            if (uGd != null) {
                C13990Tnq.A14(uGd, -1);
            } else {
                uGd = null;
            }
            uum.A01 = uGd;
            C14943UGg uGg2 = (C14943UGg) A05(uum.A0D);
            if (uGg2 != null) {
                C13990Tnq.A14(uGg2, -1);
                uGg = uGg2;
            }
            uum.A03 = uGg;
            uum.A09();
        }
    }

    public final void A0B(UL4 ul4) {
        if (this instanceof UUN) {
            UUN uun = (UUN) this;
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject A012 = UUN.A01(uun, ul4, currentTimeMillis);
            if (uun.A0H()) {
                if (uun.A01.length() > 0) {
                    C13991Tnr.A1V(uun.A01, currentTimeMillis);
                }
                uun.A01.put(A012);
                return;
            }
            uun.A05 = A012;
            return;
        }
        UUM uum = (UUM) this;
        synchronized (uum) {
            if (uum.A00 == 4) {
                long currentTimeMillis2 = System.currentTimeMillis();
                0bb r4 = new 0bb();
                Long A03 = A03(r4, ul4, currentTimeMillis2);
                String A06 = A06(r4);
                r4.A06("call_stage", UUM.A00(uum));
                if (uum.A0H()) {
                    AnonymousClass0eM r1 = uum.A09;
                    C14940UGd uGd = (C14940UGd) A05(r1);
                    if (uGd != null) {
                        uGd.A05(A06, A03);
                    }
                    C13990Tnq.A1P(r4, r1);
                } else {
                    uum.A01 = r4;
                }
            } else {
                long currentTimeMillis3 = System.currentTimeMillis();
                0bb r42 = new 0bb();
                Long A032 = A03(r42, ul4, currentTimeMillis3);
                String A062 = A06(r42);
                r42.A06("livestream_stage", UUM.A01(uum));
                if (uum.A0H()) {
                    AnonymousClass0eM r12 = uum.A0B;
                    C14947UGk uGk = (C14947UGk) A05(r12);
                    if (uGk != null) {
                        uGk.A05(A062, A032);
                    }
                    C13990Tnq.A1P(r42, r12);
                } else {
                    uum.A05 = r42;
                }
            }
        }
    }

    public final void A0C(UL4 ul4) {
        if (this instanceof UUN) {
            UUN uun = (UUN) this;
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject A012 = UUN.A01(uun, ul4, currentTimeMillis);
            if (uun.A0H()) {
                if (uun.A03.length() > 0) {
                    C13991Tnr.A1V(uun.A03, currentTimeMillis);
                }
                uun.A03.put(A012);
                return;
            }
            uun.A07 = A012;
            return;
        }
        UUM uum = (UUM) this;
        synchronized (uum) {
            if (uum.A00 == 4) {
                long currentTimeMillis2 = System.currentTimeMillis();
                0bb r4 = new 0bb();
                Long A03 = A03(r4, ul4, currentTimeMillis2);
                String A06 = A06(r4);
                r4.A06("call_stage", UUM.A00(uum));
                if (uum.A0H()) {
                    AnonymousClass0eM r1 = uum.A0D;
                    C14943UGg uGg = (C14943UGg) A05(r1);
                    if (uGg != null) {
                        uGg.A05(A06, A03);
                    }
                    C13990Tnq.A1P(r4, r1);
                } else {
                    uum.A03 = r4;
                }
            } else {
                long currentTimeMillis3 = System.currentTimeMillis();
                0bb r42 = new 0bb();
                Long A032 = A03(r42, ul4, currentTimeMillis3);
                String A062 = A06(r42);
                r42.A06("livestream_stage", UUM.A01(uum));
                if (uum.A0H()) {
                    AnonymousClass0eM r12 = uum.A0F;
                    C14950UGn uGn = (C14950UGn) A05(r12);
                    if (uGn != null) {
                        uGn.A05(A062, A032);
                    }
                    C13990Tnq.A1P(r42, r12);
                } else {
                    uum.A07 = r42;
                }
            }
        }
    }

    public final void A0D(ULY uly) {
        if (this instanceof UUN) {
            UUN uun = (UUN) this;
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject A022 = UUN.A02(uun, uly, currentTimeMillis);
            if (uun.A0H()) {
                if (uun.A02.length() > 0) {
                    C13991Tnr.A1V(uun.A02, currentTimeMillis);
                }
                uun.A02.put(A022);
                return;
            }
            uun.A06 = A022;
            return;
        }
        UUM uum = (UUM) this;
        synchronized (uum) {
            if (uum.A00 == 4) {
                long currentTimeMillis2 = System.currentTimeMillis();
                0bb r4 = new 0bb();
                ULY.A00(r4, uly);
                Long A04 = A04(r4, uly, currentTimeMillis2);
                String A06 = A06(r4);
                r4.A06("call_stage", UUM.A00(uum));
                if (uum.A0H()) {
                    AnonymousClass0eM r1 = uum.A0A;
                    C14941UGe uGe = (C14941UGe) A05(r1);
                    if (uGe != null) {
                        uGe.A05(A06, A04);
                    }
                    C13990Tnq.A1P(r4, r1);
                } else {
                    uum.A02 = r4;
                }
            } else {
                long currentTimeMillis3 = System.currentTimeMillis();
                0bb r42 = new 0bb();
                ULY.A00(r42, uly);
                Long A042 = A04(r42, uly, currentTimeMillis3);
                String A062 = A06(r42);
                r42.A06("livestream_stage", UUM.A01(uum));
                if (uum.A0H()) {
                    AnonymousClass0eM r12 = uum.A0C;
                    C14948UGl uGl = (C14948UGl) A05(r12);
                    if (uGl != null) {
                        uGl.A05(A062, A042);
                    }
                    C13990Tnq.A1P(r42, r12);
                } else {
                    uum.A06 = r42;
                }
            }
        }
    }

    public final void A0E(ULY uly) {
        if (this instanceof UUN) {
            UUN uun = (UUN) this;
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject A022 = UUN.A02(uun, uly, currentTimeMillis);
            if (uun.A0H()) {
                if (uun.A04.length() > 0) {
                    C13991Tnr.A1V(uun.A04, currentTimeMillis);
                }
                uun.A04.put(A022);
                return;
            }
            uun.A08 = A022;
            return;
        }
        UUM uum = (UUM) this;
        synchronized (uum) {
            if (uum.A00 == 4) {
                long currentTimeMillis2 = System.currentTimeMillis();
                0bb r4 = new 0bb();
                ULY.A00(r4, uly);
                Long A04 = A04(r4, uly, currentTimeMillis2);
                String A06 = A06(r4);
                r4.A06("call_stage", UUM.A00(uum));
                if (uum.A0H()) {
                    AnonymousClass0eM r1 = uum.A0E;
                    C14944UGh uGh = (C14944UGh) A05(r1);
                    if (uGh != null) {
                        uGh.A05(A06, A04);
                    }
                    C13990Tnq.A1P(r4, r1);
                } else {
                    uum.A04 = r4;
                }
            } else {
                long currentTimeMillis3 = System.currentTimeMillis();
                0bb r42 = new 0bb();
                ULY.A00(r42, uly);
                Long A042 = A04(r42, uly, currentTimeMillis3);
                String A062 = A06(r42);
                r42.A06("livestream_stage", UUM.A01(uum));
                if (uum.A0H()) {
                    AnonymousClass0eM r12 = uum.A0G;
                    C14951UGo uGo = (C14951UGo) A05(r12);
                    if (uGo != null) {
                        uGo.A05(A062, A042);
                    }
                    C13990Tnq.A1P(r42, r12);
                } else {
                    uum.A08 = r42;
                }
            }
        }
    }

    public static Object A05(AnonymousClass0eM r0) {
        return 00k.A0L((List) r0.getValue());
    }

    public static void A08(AnonymousClass0eM r0) {
        ((List) r0.getValue()).clear();
    }
}
