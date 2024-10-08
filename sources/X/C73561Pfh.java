package X;

import android.content.Context;
import android.graphics.Typeface;
import com.instagram.aistudio.deeplink.UGCThreadUrlHandlerActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;
import com.instagram.leadads.activity.LeadAdsActivity;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Pfh  reason: case insensitive filesystem */
public final class C73561Pfh extends AnonymousClass1Ek implements 0sL {
    public Object A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73561Pfh(Object obj, Object obj2, String str, String str2, AnonymousClass4D7 r6, int i) {
        super(2, r6);
        this.A01 = i;
        this.A00 = obj;
        this.A02 = obj2;
        this.A03 = str;
        this.A04 = str2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Pfh, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
        return new X.C73561Pfh(r1, r2, r3, r4, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        r1 = new X.C73561Pfh(r2, r3, r4, r5, r6);
        r1.A00 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r8, X.AnonymousClass4D7 r9) {
        /*
            r7 = this;
            int r0 = r7.A01
            r5 = r9
            switch(r0) {
                case 0: goto L_0x0026;
                case 1: goto L_0x0030;
                case 2: goto L_0x003a;
                case 3: goto L_0x0016;
                case 4: goto L_0x001e;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r2 = r7.A02
            java.lang.String r3 = r7.A04
            java.lang.String r4 = r7.A03
            r6 = 5
        L_0x000d:
            X.Pfh r0 = new X.Pfh
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            r0.A00 = r8
            return r0
        L_0x0016:
            java.lang.Object r2 = r7.A02
            java.lang.String r3 = r7.A04
            java.lang.String r4 = r7.A03
            r6 = 3
            goto L_0x000d
        L_0x001e:
            java.lang.Object r2 = r7.A02
            java.lang.String r3 = r7.A04
            java.lang.String r4 = r7.A03
            r6 = 4
            goto L_0x000d
        L_0x0026:
            java.lang.Object r1 = r7.A00
            java.lang.Object r2 = r7.A02
            java.lang.String r3 = r7.A03
            java.lang.String r4 = r7.A04
            r6 = 0
            goto L_0x0043
        L_0x0030:
            java.lang.Object r1 = r7.A00
            java.lang.Object r2 = r7.A02
            java.lang.String r3 = r7.A03
            java.lang.String r4 = r7.A04
            r6 = 1
            goto L_0x0043
        L_0x003a:
            java.lang.Object r2 = r7.A02
            java.lang.Object r1 = r7.A00
            java.lang.String r4 = r7.A04
            java.lang.String r3 = r7.A03
            r6 = 2
        L_0x0043:
            X.Pfh r0 = new X.Pfh
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73561Pfh.create(java.lang.Object, X.4D7):X.4D7");
    }

    /* JADX WARNING: type inference failed for: r2v10, types: [com.instagram.aistudio.deeplink.UGCThreadUrlHandlerActivity, android.app.Activity] */
    public final Object invokeSuspend(Object obj) {
        long j;
        Long A10;
        Long A102;
        switch (this.A01) {
            case 0:
                0eS.A00(obj);
                Iterator A0v = AnonymousClass7TF.A0v(((S7N) this.A00).A0A);
                while (A0v.hasNext()) {
                    C10654Rvo rvo = (C10654Rvo) A0v.next();
                    Context context = (Context) this.A02;
                    0qQ.A05(rvo);
                    String str = this.A03;
                    String str2 = this.A04;
                    StringBuilder A0d = JTQ.A0d(str);
                    A0d.append(rvo.A01);
                    try {
                        Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), AnonymousClass7TF.A0l(str2, A0d));
                        0qQ.A07(createFromAsset);
                        String str3 = rvo.A03;
                        0qQ.A07(str3);
                        int i = 0;
                        boolean A0d2 = 00l.A0d(str3, "Italic", false);
                        boolean A0d3 = 00l.A0d(str3, "Bold", false);
                        if (A0d2) {
                            i = 2;
                            if (A0d3) {
                                i = 3;
                            }
                        } else if (A0d3) {
                            i = 1;
                        }
                        if (createFromAsset.getStyle() != i) {
                            createFromAsset = Typeface.create(createFromAsset, i);
                        }
                        rvo.A00 = createFromAsset;
                    } catch (Exception unused) {
                    }
                }
                break;
            case 1:
                0eS.A00(obj);
                AiAgentThreadLauncher aiAgentThreadLauncher = new AiAgentThreadLauncher((UserSession) this.A00);
                ? r2 = (UGCThreadUrlHandlerActivity) this.A02;
                aiAgentThreadLauncher.A05(r2, r2, DbS.A0V(""), "", (String) null, this.A03, this.A04);
                r2.finish();
                break;
            case 2:
                0eS.A00(obj);
                0lg r0 = (0lg) this.A02;
                AnonymousClass0iw r7 = (AnonymousClass0iw) this.A00;
                String str4 = this.A04;
                String str5 = this.A03;
                AnonymousClass7TG.A1N(r0, r7);
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r7, r0), "barcelona_follow_button_tap_prompt_impression");
                if (A0e.isSampled()) {
                    long j2 = 0;
                    if (str4 == null || (A102 = AnonymousClass7TE.A10(str4)) == null) {
                        j = 0;
                    } else {
                        j = A102.longValue();
                    }
                    A0e.A9F("target_id", Long.valueOf(j));
                    C51969G9p.A1A(A0e, r7);
                    if (str5 != null) {
                        AtomicBoolean atomicBoolean = 1Xj.A0i;
                        String A06 = 1Xv.A06(str5);
                        if (!(A06 == null || (A10 = AnonymousClass7TE.A10(A06)) == null)) {
                            j2 = A10.longValue();
                        }
                    }
                    C51970G9q.A18(A0e, j2);
                    DbY.A1C(A0e);
                    A0e.Cgf();
                    break;
                }
                break;
            case 3:
                0eS.A00(obj);
                Object obj2 = this.A02;
                String str6 = this.A04;
                String str7 = this.A03;
                Integer num = AnonymousClass05K.A00;
                MGN mgn = new MGN(obj2, num, str6, str7, (AnonymousClass4D7) null, 4);
                1Eo.A03(num, 19B.A00, mgn, (C262224Cq) this.A00);
                break;
            case 4:
                0eS.A00(obj);
                C67760MuG muG = (C67760MuG) this.A02;
                C279864zZ A002 = C67760MuG.A00((C279894zc) ((Map) this.A00).get(this.A04), muG);
                if (A002 == null) {
                    if (!0qQ.A0K(muG.A05.getValue(), C68767NWc.A00)) {
                        C67760MuG.A04(muG);
                        break;
                    }
                } else {
                    C67760MuG.A03(A002, muG);
                    break;
                }
                break;
            default:
                0eS.A00(obj);
                1Xj r02 = (1Xj) this.A00;
                if (r02 != null) {
                    LeadAdsActivity leadAdsActivity = (LeadAdsActivity) this.A02;
                    String str8 = this.A04;
                    String str9 = this.A03;
                    LeadAdsActivity.A01(r02, leadAdsActivity);
                    String str10 = leadAdsActivity.A02;
                    if (str10 != null) {
                        LeadAdsActivity.A00(AnonymousClass7TE.A0l(leadAdsActivity.A0A), leadAdsActivity, str10, str8, str9, false);
                        break;
                    } else {
                        0qQ.A0F("formId");
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
                break;
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C73561Pfh) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73561Pfh(Object obj, String str, String str2, AnonymousClass4D7 r5, int i) {
        super(2, r5);
        this.A01 = i;
        this.A02 = obj;
        this.A04 = str;
        this.A03 = str2;
    }
}
