package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class NQT extends 2Cn {
    public final int A00;
    public final Object A01;

    public static Object A00(NQT nqt, Object obj) {
        0qQ.A0B(obj, 0);
        return nqt.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x013c, code lost:
        if ((r2 instanceof com.instagram.model.direct.DirectSearchResult) != false) goto L_0x013e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r15) {
        /*
            r14 = this;
            r10 = r15
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x0236;
                case 1: goto L_0x0228;
                case 2: goto L_0x0218;
                case 3: goto L_0x020d;
                case 4: goto L_0x0039;
                case 5: goto L_0x000a;
                case 6: goto L_0x01da;
                case 7: goto L_0x01bf;
                case 8: goto L_0x0164;
                case 9: goto L_0x0159;
                case 10: goto L_0x011b;
                case 11: goto L_0x00af;
                case 12: goto L_0x00a4;
                case 13: goto L_0x0090;
                default: goto L_0x0006;
            }
        L_0x0006:
            X.NQT.super.onSuccess(r15)
        L_0x0009:
            return
        L_0x000a:
            X.8Cl r10 = (X.C352218Cl) r10
            java.lang.Object r2 = A00(r14, r10)
            X.9H7 r2 = (X.AnonymousClass9H7) r2
            X.7TI r1 = X.AnonymousClass9H7.A01(r2)
            r5 = 0
            java.lang.String r0 = "DirectThreadFragment.sendPhotoMessage"
            boolean r0 = r1.A0X(r5, r0)
            if (r0 == 0) goto L_0x0009
            X.7TI r0 = X.AnonymousClass9H7.A01(r2)
            X.7L9 r7 = r0.A0K()
            com.instagram.common.session.UserSession r6 = r2.A10
            X.Pmw r4 = new X.Pmw
            r8 = r5
            r9 = r5
            r11 = r5
            r12 = r5
            r13 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r0 = "sendPhoto"
            X.AnonymousClass7L9.A00(r7, r0, r4)
            return
        L_0x0039:
            X.5fe r10 = (X.C290645fe) r10
            java.lang.Object r4 = A00(r14, r10)
            com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel r4 = (com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel) r4
            r4.A00 = r10
            com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel.A06(r4)
            com.instagram.common.session.UserSession r3 = r4.A04
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317934219433649(0x8106f8002016b1, double:3.0309460687283E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0009
            X.4Co r0 = r4.A02
            X.4D7 r3 = X.C51975G9x.A0t(r0)
            X.6oS r2 = X.C318116oQ.A00(r4)
            r1 = 44
            X.MFR r0 = new X.MFR
            r0.<init>(r4, r3, r1)
            X.1Er r0 = X.C51966G9m.A1L(r0, r2)
            r4.A02 = r0
            X.5fe r3 = r4.A00
            if (r3 == 0) goto L_0x0009
            X.05G r0 = r4.A07
            java.lang.Object r0 = r0.getValue()
            java.util.Iterator r2 = X.C51966G9m.A1H(r0)
        L_0x007a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0009
            java.lang.Object r1 = r2.next()
            X.N64 r1 = (X.N64) r1
            boolean r0 = r1.A09
            if (r0 == 0) goto L_0x007a
            java.lang.String r0 = r1.A07
            r3.A07(r0)
            goto L_0x007a
        L_0x0090:
            java.io.File r10 = (java.io.File) r10
            java.lang.Object r2 = A00(r14, r10)
            X.OV1 r2 = (X.OV1) r2
            X.OIB r1 = r2.A00
            java.lang.String r0 = r10.getCanonicalPath()
            r1.A08 = r0
            r2.A01()
            return
        L_0x00a4:
            X.9B2 r10 = (X.AnonymousClass9B2) r10
            java.lang.Object r0 = A00(r14, r10)
            X.TvH r0 = (X.C14388TvH) r0
            r0.A00 = r10
            return
        L_0x00af:
            X.5fe r10 = (X.C290645fe) r10
            java.lang.Object r4 = A00(r14, r10)
            X.NeB r4 = (X.C69072NeB) r4
            X.05G r3 = r4.A0C
            boolean r0 = r4.A06
            if (r0 != 0) goto L_0x0104
            X.5gJ r9 = r4.A08
            r8 = 77014026(0x497240a, float:3.5533026E-36)
            r6 = 0
            X.02m r7 = r9.A00
            r7.markerStart(r8)
            java.lang.String r5 = "direct_user_search_nullstate"
            X.5g5 r2 = r10.A01(r5)
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x00db
            java.util.List r0 = r2.A02
            int r0 = r0.size()
            r9.A00(r8, r1, r5, r0)
        L_0x00db:
            r0 = 77017147(0x497303b, float:3.5544222E-36)
            r7.markerStart(r0)
            java.util.List r0 = r2.A02
            r4.A02 = r0
            if (r1 == 0) goto L_0x00ec
            X.05G r0 = r4.A0B
            r0.Epw(r1)
        L_0x00ec:
            java.lang.String r0 = "direct_ibc_nullstate"
            X.5g5 r2 = r10.A01(r0)
            boolean r0 = r4.A0H
            if (r0 == 0) goto L_0x00f8
            java.util.List r6 = r2.A02
        L_0x00f8:
            r4.A03 = r6
            X.05G r1 = r4.A09
            java.lang.String r0 = r2.A01
            r1.Epw(r0)
            r0 = 1
            r4.A06 = r0
        L_0x0104:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.List r0 = r4.A02
            if (r0 == 0) goto L_0x010f
            r1.addAll(r0)
        L_0x010f:
            X.C69072NeB.A00(r4)
            r3.Epw(r1)
            X.05G r0 = r4.A0A
            X.JTR.A1W(r0)
            return
        L_0x011b:
            X.9B2 r10 = (X.AnonymousClass9B2) r10
            java.lang.Object r3 = A00(r14, r10)
            X.NeB r3 = (X.C69072NeB) r3
            boolean r2 = r3.A0G
            r0 = 0
            if (r2 == 0) goto L_0x0148
            java.util.ArrayList r1 = r10.A01()
        L_0x012c:
            r3.A01 = r1
            if (r2 == 0) goto L_0x0146
            com.instagram.model.direct.DirectShareTarget r1 = r10.A00()
            if (r1 == 0) goto L_0x0146
            com.instagram.model.direct.DirectShareTarget r2 = r10.A00()
            boolean r1 = r2 instanceof com.instagram.model.direct.DirectSearchResult
            if (r1 == 0) goto L_0x0146
        L_0x013e:
            r3.A00 = r2
            boolean r1 = r3.A0I
            if (r1 == 0) goto L_0x0153
            monitor-enter(r10)
            goto L_0x014a
        L_0x0146:
            r2 = r0
            goto L_0x013e
        L_0x0148:
            r1 = r0
            goto L_0x012c
        L_0x014a:
            X.9B4 r0 = r10.A00     // Catch:{ all -> 0x014f }
            com.google.common.collect.ImmutableList r0 = r0.A01     // Catch:{ all -> 0x014f }
            goto L_0x0152
        L_0x014f:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x0152:
            monitor-exit(r10)
        L_0x0153:
            r3.A04 = r0
            X.C69072NeB.A00(r3)
            return
        L_0x0159:
            X.5fe r10 = (X.C290645fe) r10
            java.lang.Object r0 = A00(r14, r10)
            X.NeA r0 = (X.C69071NeA) r0
            r0.A00 = r10
            return
        L_0x0164:
            X.5fe r10 = (X.C290645fe) r10
            r6 = 0
            X.0qQ.A0B(r10, r6)
            java.lang.Object r5 = r14.A01
            X.Ma2 r5 = (X.C66633Ma2) r5
            r5.A0K = r10
            X.C66633Ma2.A0P(r5)
            X.0eM r0 = r5.A2N
            java.lang.Object r0 = r0.getValue()
            X.MgA r0 = (X.C66976MgA) r0
            if (r0 == 0) goto L_0x01a5
            X.0eM r0 = r0.A08
            X.49u r0 = X.C66580MXl.A0X(r0)
            X.49x r4 = r0.A04
            com.instagram.common.session.UserSession r3 = r4.A04
            boolean r0 = X.AnonymousClass4AJ.A01(r3)
            if (r0 == 0) goto L_0x01a5
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327576419711514(0x810fbd000c3a1a, double:3.037043835010046E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x01a5
            X.4Co r0 = r4.A02
            r1 = 1
            if (r0 == 0) goto L_0x01ae
            boolean r0 = r0.isActive()
            if (r0 != r1) goto L_0x01ae
        L_0x01a5:
            r5.A19 = r6
            X.Mi9 r1 = r5.A0u()
            java.lang.String r0 = "init_banyan_end"
            goto L_0x01d6
        L_0x01ae:
            X.4Cq r3 = r4.A01
            r2 = 0
            r1 = 44
            X.9Jz r0 = new X.9Jz
            r0.<init>((java.lang.Object) r4, (java.lang.Object) r10, (X.AnonymousClass4D7) r2, (int) r1)
            X.1Er r0 = X.C51966G9m.A1L(r0, r3)
            r4.A02 = r0
            goto L_0x01a5
        L_0x01bf:
            X.9B2 r10 = (X.AnonymousClass9B2) r10
            r1 = 0
            X.0qQ.A0B(r10, r1)
            java.lang.Object r0 = r14.A01
            X.Ma2 r0 = (X.C66633Ma2) r0
            r0.A0J = r10
            X.C66633Ma2.A0O(r0)
            r0.A18 = r1
            X.Mi9 r1 = r0.A0u()
            java.lang.String r0 = "init_ai_agent_end"
        L_0x01d6:
            r1.A0E(r0)
            return
        L_0x01da:
            java.lang.String r10 = (java.lang.String) r10
            r4 = 0
            X.0qQ.A0B(r10, r4)
            java.lang.Object r3 = r14.A01
            X.OGr r3 = (X.C70696OGr) r3
            com.instagram.common.session.UserSession r0 = r3.A03
            X.1NY r2 = X.AnonymousClass7TG.A0b(r0)
            java.lang.String r0 = "direct_v2/threads/customized_theme_preview/"
            r2.A0A(r0)
            java.lang.Class<X.NGv> r1 = X.NGv.class
            java.lang.Class<X.OQB> r0 = X.OQB.class
            r2.A0Q(r1, r0)
            java.lang.String r0 = "theme_image_fbid"
            X.1OC r2 = X.DbT.A0T(r2, r0, r10)
            r1 = 3
            X.Ufe r0 = new X.Ufe
            r0.<init>(r10, r3, r1)
            r2.A00 = r0
            X.1GK r0 = r2.A04
            int r1 = r0.runnableId
            r0 = 2
            X.1ES.A05(r2, r1, r0, r4, r4)
            return
        L_0x020d:
            X.5fe r10 = (X.C290645fe) r10
            java.lang.Object r0 = A00(r14, r10)
            X.NKn r0 = (X.C68494NKn) r0
            r0.A00 = r10
            return
        L_0x0218:
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r0 = A00(r14, r10)
            X.NV6 r0 = (X.NV6) r0
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            r0.A05 = r10
            X.NV6.A03(r0)
            return
        L_0x0228:
            X.5fe r10 = (X.C290645fe) r10
            java.lang.Object r0 = A00(r14, r10)
            java.lang.String r0 = X.DbS.A0q(r0)
            r10.A05(r0)
            return
        L_0x0236:
            java.io.File r10 = (java.io.File) r10
            java.lang.Object r1 = A00(r14, r10)
            android.content.Context r1 = (android.content.Context) r1
            X.C59730JVo.A08(r1, r10)
            r0 = 2131972564(0x7f1351d4, float:1.958214E38)
            X.C59689JTv.A07(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NQT.onSuccess(java.lang.Object):void");
    }

    public NQT(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onFail(Exception exc) {
        int i;
        String str;
        Context context;
        switch (this.A00) {
            case 0:
                context = (Context) this.A01;
                i = 2131972562;
                str = "ify_save_media_failed_toast";
                break;
            case 2:
                0qQ.A0B(exc, 0);
                0wb.A08("DirectIndividualStackCardGalleryFragment_getRemoteMediaTaskFailed", exc);
                C59689JTv.A0A(((Fragment) this.A01).getContext(), "error");
                return;
            case 5:
                0qQ.A0B(exc, 0);
                Context context2 = ((AnonymousClass9H7) this.A01).A02;
                if (context2 == null) {
                    0qQ.A0F("context");
                    throw AnonymousClass00P.createAndThrow();
                }
                C59689JTv.A00(context2, context2.getResources().getString(2131960324), "direct_share_photo_failure", 0);
                0wb.A03("DirectThreadToggleController", "Unable to parse photo uri.");
                return;
            case 6:
                0qQ.A0B(exc, 0);
                C70696OGr oGr = (C70696OGr) this.A01;
                oGr.A05.hide();
                if (!(exc instanceof IOException) || !(exc.getCause() instanceof IllegalArgumentException)) {
                    C59689JTv.A0D(oGr.A01, "network_error");
                    return;
                }
                Context context3 = oGr.A01;
                C59689JTv.A00(context3, DbW.A0h(context3, Integer.valueOf(oGr.A00), 2131957262), "user_input_error", 0);
                return;
            case 7:
                0qQ.A0B(exc, 0);
                ((C66633Ma2) this.A01).A18 = false;
                return;
            case 8:
                0qQ.A0B(exc, 0);
                ((C66633Ma2) this.A01).A19 = false;
                return;
            case 9:
                C69071NeA neA = (C69071NeA) this.A01;
                neA.A00 = C290635fd.A00(neA.A03);
                return;
            case 11:
                C69072NeB neB = (C69072NeB) this.A01;
                neB.A06 = true;
                neB.A0C.Epw(0sn.A00);
                AnonymousClass7TF.A1O(neB.A0A, true);
                return;
            case 13:
                OIB oib = ((OV1) this.A01).A00;
                OMU omu = oib.A04;
                if (omu != null) {
                    omu.A00();
                }
                context = oib.A00;
                if (!oib.A06.equals(1iA.A0a)) {
                    i = 2131961945;
                    str = "failed_to_load_photo_toast";
                    break;
                } else {
                    i = 2131961946;
                    str = "failed_to_load_video_toast";
                    break;
                }
            case 14:
                C72921PPf pPf = (C72921PPf) this.A01;
                String str2 = pPf.A06;
                if (str2 == null || str2.length() == 0) {
                    OWV owv = pPf.A0C;
                    pPf.A05 = AnonymousClass7TE.A1C();
                    pPf.A07.clear();
                    owv.A02(1, 2, 0);
                    pPf.A08 = false;
                    C72921PPf.A00(pPf);
                    return;
                }
                return;
            default:
                NQT.super.onFail(exc);
                return;
        }
        C59689JTv.A0F(context, str, i);
    }

    public final void onFinish() {
        ArrayList A1C;
        switch (this.A00) {
            case 2:
                AnonymousClass6ST r0 = ((NV6) this.A01).A02;
                if (r0 != null) {
                    r0.hide();
                    return;
                }
                return;
            case 13:
                return;
            case 14:
                C72921PPf pPf = (C72921PPf) this.A01;
                String str = pPf.A06;
                if (str == null || str.length() == 0) {
                    OWV owv = pPf.A0C;
                    if (!owv.A09) {
                        C290645fe r02 = owv.A03;
                        if (r02 == null) {
                            A1C = AnonymousClass7TE.A1C();
                            pPf.A05 = A1C;
                            HashMap hashMap = pPf.A07;
                            owv.A03(hashMap);
                            pPf.A07 = hashMap;
                            Object obj = pPf.A05;
                            0qQ.A0C(obj, AnonymousClass000.A00(12));
                            owv.A02(1, 0, (long) DbS.A05(obj));
                            pPf.A08 = false;
                            C72921PPf.A00(pPf);
                            return;
                        }
                        OWV.A00(r02, owv);
                    }
                    A1C = AnonymousClass7TE.A1C();
                    List list = owv.A08;
                    if (list != null) {
                        A1C.addAll(list);
                    }
                    pPf.A05 = A1C;
                    HashMap hashMap2 = pPf.A07;
                    owv.A03(hashMap2);
                    pPf.A07 = hashMap2;
                    Object obj2 = pPf.A05;
                    0qQ.A0C(obj2, AnonymousClass000.A00(12));
                    owv.A02(1, 0, (long) DbS.A05(obj2));
                    pPf.A08 = false;
                    C72921PPf.A00(pPf);
                    return;
                }
                return;
            default:
                NQT.super.onFinish();
                return;
        }
    }

    public final void onStart() {
        switch (this.A00) {
            case 2:
                NV6 nv6 = (NV6) this.A01;
                AnonymousClass6ST r2 = nv6.A02;
                if (r2 == null) {
                    r2 = new AnonymousClass6ST(nv6.requireContext(), true);
                    nv6.A02 = r2;
                }
                DbX.A15(nv6.requireActivity(), r2);
                AnonymousClass6ST r0 = nv6.A02;
                if (r0 != null) {
                    AnonymousClass0fN.A00(r0);
                    return;
                }
                return;
            case 13:
                OMU omu = ((OV1) this.A01).A00.A04;
                if (omu != null) {
                    omu.A01();
                    return;
                }
                return;
            default:
                NQT.super.onStart();
                return;
        }
    }
}
