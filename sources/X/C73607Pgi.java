package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: X.Pgi  reason: case insensitive filesystem */
public final class C73607Pgi extends 03J implements 0sL {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C73607Pgi(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L_0x0013;
                case 1: goto L_0x001b;
                case 2: goto L_0x0023;
                case 3: goto L_0x002b;
                case 4: goto L_0x002b;
                case 5: goto L_0x0033;
                case 6: goto L_0x0033;
                case 7: goto L_0x003b;
                case 8: goto L_0x0043;
                case 9: goto L_0x004b;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<X.Nep> r3 = X.C69110Nep.class
            r1 = 2
            java.lang.String r4 = "onFirstFrameRendered"
            java.lang.String r5 = "onFirstFrameRendered(ZLcom/instagram/rtc/presentation/participants/RtcCallFirstFrameRenderedType;)V"
        L_0x000d:
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0013:
            java.lang.Class<X.Ob6> r3 = X.C71083Ob6.class
            r1 = 2
            java.lang.String r4 = "onAiStickerSearchSuccess"
            java.lang.String r5 = "onAiStickerSearchSuccess(Ljava/util/List;Ljava/lang/String;)V"
            goto L_0x000d
        L_0x001b:
            java.lang.Class<X.P3E> r3 = X.P3E.class
            r1 = 2
            java.lang.String r4 = "onAiStickerSearchSuccess"
            java.lang.String r5 = "onAiStickerSearchSuccess(Ljava/util/List;Ljava/lang/String;)V"
            goto L_0x000d
        L_0x0023:
            java.lang.Class<X.P3E> r3 = X.P3E.class
            r1 = 2
            java.lang.String r4 = "onSavedStickerSearchSuccess"
            java.lang.String r5 = "onSavedStickerSearchSuccess(Ljava/util/List;Lcom/instagram/stickersearch/api/StickerSearchApiUtil$SearchQuery;)V"
            goto L_0x000d
        L_0x002b:
            java.lang.Class<X.PA3> r3 = X.PA3.class
            r1 = 2
            java.lang.String r4 = "enableAdminRemoveEducationalNux"
            java.lang.String r5 = "enableAdminRemoveEducationalNux(Ljava/lang/String;Ljava/lang/String;)V"
            goto L_0x000d
        L_0x0033:
            java.lang.Class<X.PA3> r3 = X.PA3.class
            r1 = 2
            java.lang.String r4 = "enableUnsendWarningBanner"
            java.lang.String r5 = "enableUnsendWarningBanner(Ljava/lang/String;Ljava/lang/String;)V"
            goto L_0x000d
        L_0x003b:
            java.lang.Class<X.Odx> r3 = X.C71143Odx.class
            r1 = 2
            java.lang.String r4 = "registerAppModelListener"
            java.lang.String r5 = "registerAppModelListener(Lcom/facebook/rsys/callmanager/gen/CallApi;Lcom/instagram/rtc/rsys/proxies/EngineProxy;)V"
            goto L_0x000d
        L_0x0043:
            java.lang.Class<X.4mf> r3 = X.C273494mf.class
            r1 = 2
            java.lang.String r4 = "onBottomSheetPositionChanged"
            java.lang.String r5 = "onBottomSheetPositionChanged(II)V"
            goto L_0x000d
        L_0x004b:
            java.lang.Class<X.NgG> r3 = X.NgG.class
            r1 = 2
            java.lang.String r4 = "renderViewSizeChanged"
            java.lang.String r5 = "renderViewSizeChanged(II)V"
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73607Pgi.<init>(java.lang.Object, int):void");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        String str;
        Object obj3 = obj;
        Object obj4 = obj2;
        switch (this.A00) {
            case 0:
                List list = (List) obj3;
                String str2 = (String) obj4;
                C71083Ob6 ob6 = (C71083Ob6) this.receiver;
                if (list != null) {
                    if (!list.isEmpty()) {
                        05G r2 = ob6.A0B.A04;
                        C68175N3q n3q = (C68175N3q) r2.getValue();
                        String str3 = ((C68175N3q) r2.getValue()).A03;
                        HMC hmc = HMC.Success;
                        String str4 = n3q.A03;
                        boolean z = n3q.A06;
                        C45274Ctd ctd = n3q.A00;
                        String str5 = n3q.A04;
                        DbY.A1S(hmc, str4);
                        r2.Epw(new C68175N3q(ctd, hmc, str4, str3, str5, true, z));
                        int i2 = ob6.A05;
                        List A0d = 00k.A0d(list, i2);
                        int i3 = ob6.A04;
                        for (Object add : 00k.A0h(A0d, i3)) {
                            ob6.A02.add(add);
                        }
                        N47 n47 = ob6.A01;
                        C71083Ob6.A01(N47.A00(AnonymousClass05K.A0C, C71083Ob6.A00(ob6), n47.A04, 00k.A0h(00k.A0S(00k.A0d(list, i2), (Collection) n47.A01), i3), false), ob6);
                        RecyclerView recyclerView = ob6.A00;
                        if (recyclerView != null) {
                            2Rw r0 = recyclerView.A0A;
                            if (r0 != null) {
                                i = r0.getItemCount() - 1;
                            } else {
                                i = 0;
                            }
                            recyclerView.A0o(i);
                            break;
                        }
                    } else {
                        C71083Ob6.A02(ob6, AnonymousClass05K.A01, str2);
                        break;
                    }
                } else {
                    C71083Ob6.A02(ob6, AnonymousClass05K.A00, (String) null);
                    break;
                }
                break;
            case 1:
                List list2 = (List) obj3;
                P3E p3e = (P3E) this.receiver;
                if (list2 != null && !list2.isEmpty()) {
                    RecyclerView recyclerView2 = p3e.A06;
                    if (recyclerView2 != null) {
                        recyclerView2.A0o(0);
                        N40 n40 = p3e.A09;
                        List list3 = n40.A02;
                        List list4 = n40.A04;
                        List list5 = n40.A03;
                        if (p3e.A0a) {
                            list2 = 00k.A0h(00k.A0S(p3e.A09.A01, 00k.A0d(list2, p3e.A0B)), p3e.A0C);
                        }
                        P3E.A02(p3e, N40.A00(AnonymousClass05K.A0C, list3, list4, list5, list2, n40.A05, false, false, false, false, false, n40.A06));
                        P3E.A04(p3e, false);
                        break;
                    } else {
                        C66580MXl.A19();
                        throw AnonymousClass00P.createAndThrow();
                    }
                } else {
                    P3E.A01(p3e);
                    break;
                }
            case 2:
                List<N41> list6 = (List) obj3;
                boolean A1Z = AnonymousClass7TG.A1Z(list6, obj4);
                P3E p3e2 = (P3E) this.receiver;
                if (obj4.equals(C71002OVz.A03)) {
                    C72188Oxx oxx = p3e2.A0Q;
                    ArrayList A0r = AnonymousClass7TG.A0r(list6);
                    for (N41 A01 : list6) {
                        A0r.add(A01.A01());
                    }
                    synchronized (oxx) {
                        Set set = oxx.A01;
                        set.clear();
                        set.addAll(A0r);
                        oxx.A00 = A1Z;
                    }
                }
                if (AnonymousClass7TE.A1b(list6)) {
                    N40 n402 = p3e2.A09;
                    P3E.A03(p3e2, n402, n402.A00, n402.A02, list6);
                    break;
                }
                break;
            case 3:
            case 4:
                String str6 = (String) obj3;
                0qQ.A0B(str6, 0);
                PA3 pa3 = (PA3) this.receiver;
                1Av A002 = 1Au.A00(pa3.A01);
                C72194OyE.A00(pa3.A05, "remove_message_successful", "view", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, str6, AnonymousClass7TF.A0w("message_id", str6));
                0xa r1 = A002.A01;
                if (!r1.getBoolean("seen_direct_admin_remove_message_warning_dialog", false)) {
                    0xY AR4 = r1.AR4();
                    AR4.E5T("show_direct_admin_remove_message_warning_dialog", true);
                    AR4.apply();
                    break;
                }
                break;
            case 7:
                AnonymousClass7TG.A1N(obj3, obj4);
                C71143Odx.A05((C71143Odx) this.receiver, new C74186PqS(17, obj4, obj3));
                break;
            case 8:
                ((C273494mf) this.receiver).onBottomSheetPositionChanged(AnonymousClass7TE.A0M(obj3), AnonymousClass7TE.A0M(obj4));
                break;
            case 9:
                int A0M = AnonymousClass7TE.A0M(obj3);
                int A0M2 = AnonymousClass7TE.A0M(obj4);
                NgG ngG = (NgG) this.receiver;
                C68166N3g n3g = ngG.A00;
                if (n3g != null) {
                    ngG.A07.invoke(n3g.A09, Integer.valueOf(A0M), Integer.valueOf(A0M2));
                    break;
                }
                break;
            case 10:
                boolean A1a = AnonymousClass7TE.A1a(obj3);
                0qQ.A0B(obj4, 1);
                C69110Nep nep = (C69110Nep) this.receiver;
                if (obj4 == C69265NiR.FRAME_RENDERED) {
                    nep.A05.runOnUiThread(new C73266PZk(nep, A1a));
                }
                C74561PxA pxA = nep.A08.A00;
                if (A1a) {
                    if (pxA != null) {
                        str = "self_first_frame_rendered";
                    }
                } else if (pxA != null) {
                    str = "remote_first_frame_rendered";
                }
                pxA.AIe(str);
                break;
            default:
                String str7 = (String) obj4;
                0qQ.A0B(obj3, 0);
                1Av A003 = 1Au.A00(((PA3) this.receiver).A01);
                if (str7 != null) {
                    DbX.A1T(AnonymousClass7TE.A0p(A003), "unsend_warning_banner_enabled_for_thread_v2/", str7, true);
                }
                if (A003.A01.getInt(C273654mx.A00(1006), 0) < 2) {
                    AnonymousClass7TF.A1J(A003, A003.A7x, 1Av.A8a, 406, true);
                    break;
                }
                break;
        }
        return C60340gF.A00;
    }
}
