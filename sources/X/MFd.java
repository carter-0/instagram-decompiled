package X;

import android.app.Activity;
import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;
import com.instagram.quicksnap.data.repository.QuickSnapRepository;
import com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments;
import java.io.File;
import java.util.List;

public final class MFd extends AnonymousClass1Ek implements 0sL {
    public Object A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFd(Object obj, Object obj2, String str, AnonymousClass4D7 r5, int i) {
        super(2, r5);
        this.A01 = i;
        this.A03 = obj;
        this.A04 = str;
        this.A02 = obj2;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.MFd, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        r1 = new X.MFd(r2, r3, r4, r5, r6);
        r1.A00 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        return new X.MFd(r1, r2, r3, r4, r5, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r8, X.AnonymousClass4D7 r9) {
        /*
            r7 = this;
            int r0 = r7.A01
            r5 = r9
            switch(r0) {
                case 0: goto L_0x0015;
                case 1: goto L_0x0033;
                case 2: goto L_0x001f;
                case 3: goto L_0x003b;
                case 4: goto L_0x0029;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r3 = r7.A03
            java.lang.String r4 = r7.A04
            java.lang.Object r1 = r7.A02
            java.lang.Object r2 = r7.A00
            r6 = 5
        L_0x000f:
            X.MFd r0 = new X.MFd
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x0015:
            java.lang.Object r3 = r7.A03
            java.lang.Object r1 = r7.A02
            java.lang.String r4 = r7.A04
            java.lang.Object r2 = r7.A00
            r6 = 0
            goto L_0x000f
        L_0x001f:
            java.lang.Object r1 = r7.A02
            java.lang.Object r2 = r7.A00
            java.lang.Object r3 = r7.A03
            java.lang.String r4 = r7.A04
            r6 = 2
            goto L_0x000f
        L_0x0029:
            java.lang.Object r3 = r7.A03
            java.lang.String r4 = r7.A04
            java.lang.Object r1 = r7.A02
            java.lang.Object r2 = r7.A00
            r6 = 4
            goto L_0x000f
        L_0x0033:
            java.lang.Object r3 = r7.A02
            java.lang.Object r2 = r7.A03
            java.lang.String r4 = r7.A04
            r6 = 1
            goto L_0x0042
        L_0x003b:
            java.lang.Object r2 = r7.A03
            java.lang.String r4 = r7.A04
            java.lang.Object r3 = r7.A02
            r6 = 3
        L_0x0042:
            X.MFd r0 = new X.MFd
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            r0.A00 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MFd.create(java.lang.Object, X.4D7):X.4D7");
    }

    public final Object invokeSuspend(Object obj) {
        C63739L4x l4x;
        List list;
        C55672HlV hlV;
        String str;
        Object obj2;
        C58690Ivz ivz;
        boolean z;
        char A1U;
        int i;
        15p r3;
        1NY A0a;
        Object[] objArr;
        String str2;
        switch (this.A01) {
            case 0:
                0eS.A00(obj);
                C71024OZb oZb = ((HDY) this.A03).A01;
                Activity activity = (Activity) this.A02;
                String str3 = this.A04;
                C74439Puu puu = (C74439Puu) this.A00;
                AnonymousClass7TG.A1T(activity, str3, puu);
                oZb.A02(activity, puu, str3, (String) null);
                break;
            case 1:
                0eS.A00(obj);
                C262224Cq r4 = (C262224Cq) this.A00;
                Object obj3 = this.A03;
                String str4 = this.A04;
                for (Object mh7 : (List) this.A02) {
                    AnonymousClass7TE.A1Z(new MH7(mh7, (Object) r4, obj3, str4, (AnonymousClass4D7) null, 10), r4);
                }
                break;
            case 2:
                0eS.A00(obj);
                Bitmap bitmap = (Bitmap) this.A02;
                String A0Q = 002.A0Q("quick_snap_temp_", System.currentTimeMillis());
                boolean A1U2 = AnonymousClass7TF.A1U(0, bitmap, A0Q);
                File file = new File(2RR.A01(), A0Q);
                1MF.A0M(bitmap, file);
                0qQ.A0B(file, 0);
                Medium A032 = C282665Eg.A03(file, A1U2 ? 1 : 0, 0);
                LMM lmm = (LMM) this.A00;
                if (lmm.A00 == AnonymousClass3QO.CLOSE_FRIENDS || ((l4x = lmm.A01) != null && (((list = l4x.A01) != null && AnonymousClass7TE.A1b(list) == A1U2) || l4x.A00 != null))) {
                    QuickSnapRepository quickSnapRepository = ((C352838Ff) this.A03).A0C;
                    L8N l8n = new L8N(A032, lmm, this.A04);
                    quickSnapRepository.A06.put(l8n.A03, C51966G9m.A1L(new MH5((Object) quickSnapRepository, (Object) l8n, (AnonymousClass4D7) null, 19), quickSnapRepository.A01));
                    break;
                }
            case 3:
                0eS.A00(obj);
                C64141LQd lQd = (C64141LQd) this.A03;
                String str5 = this.A04;
                C64141LQd.A01(lQd, str5, new C20785Wyw(lQd, 20));
                AnonymousClass7TE.A1Z(new MG5(lQd, (AnonymousClass4D7) null, 13), (C262224Cq) this.A02);
                C17999Vjb vjb = lQd.A03;
                String str6 = (String) ((C59678JTj) this.A00).A01;
                0qQ.A0B(str5, 0);
                ShoppingTaggingFeedArguments shoppingTaggingFeedArguments = vjb.A02;
                0Aj A0e = AnonymousClass7TE.A0e((0wc) vjb.A03.getValue(), "instagram_shopping_product_tagging_feed_load_failure");
                A0e.AAJ("prior_module", shoppingTaggingFeedArguments.A0B);
                A0e.AAJ("session_instance_id", shoppingTaggingFeedArguments.A0F);
                A0e.AAJ("waterfall_id", shoppingTaggingFeedArguments.A0G);
                A0e.AAJ("usage", shoppingTaggingFeedArguments.A03.A00);
                A0e.AAJ("source_id", shoppingTaggingFeedArguments.A0C);
                A0e.AAJ("source_type", shoppingTaggingFeedArguments.A0D);
                A0e.AAK((0bb) vjb.A04.getValue(), "suggested_tags_info");
                A0e.A7p("is_organic_product_tagging", Boolean.valueOf(shoppingTaggingFeedArguments.A00));
                A0e.AAJ("search_text", str5);
                A0e.AAJ("error_message", str6);
                A0e.Cgf();
                C64834Liw A002 = C17053VGb.A00(lQd.A02);
                C62535KhR khR = C62535KhR.A03;
                if (A002.A00.containsKey(khR)) {
                    A002.A01.flowMarkError(C64834Liw.A00(khR, A002), "response_error", str6);
                    break;
                }
                break;
            case 4:
                0eS.A00(obj);
                C54430HDc hDc = (C54430HDc) this.A03;
                hlV = hDc.A00;
                str = this.A04;
                obj2 = this.A02;
                ivz = new C58690Ivz(38, this.A00, hDc);
                z = false;
                A1U = AnonymousClass7TF.A1U(0, str, obj2);
                i = 2;
                r3 = null;
                A0a = AnonymousClass7TG.A0a(hlV.A00);
                objArr = new Object[2];
                objArr[0] = str;
                str2 = "like";
                break;
            default:
                0eS.A00(obj);
                C54430HDc hDc2 = (C54430HDc) this.A03;
                hlV = hDc2.A00;
                str = this.A04;
                obj2 = this.A02;
                ivz = new C58690Ivz(39, this.A00, hDc2);
                z = false;
                A1U = AnonymousClass7TF.A1U(0, str, obj2);
                i = 2;
                r3 = null;
                A0a = AnonymousClass7TG.A0a(hlV.A00);
                objArr = new Object[2];
                objArr[0] = str;
                str2 = "unlike";
                break;
        }
        objArr[A1U] = str2;
        A0a.A0K(AnonymousClass000.A00(695), objArr);
        1OC A0R = DbT.A0R(r3, A0a, 1XP.class, 1XY.class, z);
        A0R.A00 = new H4O(obj2, hlV, ivz, str, i);
        1ES.A03(A0R);
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MFd) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFd(Object obj, Object obj2, Object obj3, String str, AnonymousClass4D7 r6, int i) {
        super(2, r6);
        this.A01 = i;
        this.A02 = obj;
        this.A00 = obj2;
        this.A03 = obj3;
        this.A04 = str;
    }
}
