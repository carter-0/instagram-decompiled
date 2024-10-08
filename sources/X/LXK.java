package X;

import android.view.View;

public final class LXK implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final String A02;

    public LXK(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x03c1, code lost:
        X.AnonymousClass0fD.A0C(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x03c4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x03e5, code lost:
        X.AnonymousClass0fD.A0C(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x03e8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01f5, code lost:
        X.0qQ.A0F(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01fc, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x024d, code lost:
        X.AnonymousClass0fD.A0C(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0250, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r15) {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x03c7;
                case 1: goto L_0x0374;
                case 2: goto L_0x035a;
                case 3: goto L_0x00dd;
                case 4: goto L_0x022d;
                case 5: goto L_0x0331;
                case 6: goto L_0x02cc;
                case 7: goto L_0x026d;
                case 8: goto L_0x0256;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x0140;
                case 12: goto L_0x00b4;
                case 13: goto L_0x009b;
                case 14: goto L_0x006a;
                case 15: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r14.A01
            X.8Be r1 = (X.C351978Be) r1
            java.lang.String r0 = r14.A02
            X.C351978Be.A00(r1, r0)
            return
        L_0x000f:
            r0 = 204891396(0xc366504, float:1.4051168E-31)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r14.A01
            instagram.features.clips.edit.ClipsEditMetadataController r6 = (instagram.features.clips.edit.ClipsEditMetadataController) r6
            com.instagram.common.session.UserSession r5 = r6.A0s
            X.27r r7 = X.27p.A01(r5)
            java.lang.String r4 = r14.A02
            if (r4 == 0) goto L_0x0067
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0067
            java.lang.String r9 = "EDIT_LINK_ROW"
        L_0x002c:
            X.1Xj r0 = r6.A0D
            if (r0 == 0) goto L_0x0065
            java.lang.String r10 = r0.getId()
        L_0x0034:
            X.JVj r8 = X.C59725JVj.POST_CAPTURE
            com.instagram.user.model.User r0 = X.DbT.A0j(r5)
            java.lang.String r11 = r0.getId()
            if (r4 == 0) goto L_0x0062
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0062
            java.lang.String r12 = "edit_button"
        L_0x0048:
            X.0iw r0 = r6.A0r
            java.lang.String r13 = r0.getModuleName()
            r7.A1U(r8, r9, r10, r11, r12, r13)
            android.content.Context r2 = r6.A0n
            r1 = 26
            X.J6f r0 = new X.J6f
            r0.<init>(r6, r1)
            X.C63214KtL.A00(r2, r5, r4, r0)
            r0 = -135879005(0xfffffffff7e6a6a3, float:-9.356313E33)
            goto L_0x03c1
        L_0x0062:
            java.lang.String r12 = "add_button"
            goto L_0x0048
        L_0x0065:
            r10 = 0
            goto L_0x0034
        L_0x0067:
            java.lang.String r9 = "ADD_LINK_ROW"
            goto L_0x002c
        L_0x006a:
            r0 = -1322443261(0xffffffffb12d1e03, float:-2.5191873E-9)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel r8 = X.LRB.A00(r0)
            java.lang.String r9 = r14.A02
            r0 = 0
            X.0qQ.A0B(r9, r0)
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r0 = r8.A0C
            X.0Ud r0 = r0.A06
            java.lang.Object r7 = r0.getValue()
            if (r7 == 0) goto L_0x0096
            X.6oS r0 = X.C318116oQ.A00(r8)
            r10 = 0
            r11 = 27
            X.MGk r6 = new X.MGk
            r6.<init>(r7, r8, r9, r10, r11)
            X.AnonymousClass7TE.A1Z(r6, r0)
        L_0x0096:
            r0 = 394370437(0x17819d85, float:8.376193E-25)
            goto L_0x03e5
        L_0x009b:
            r0 = -1945869955(0xffffffff8c04617d, float:-1.0198247E-31)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A01
            X.KVB r1 = (X.KVB) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.MSg r1 = r1.A01
            java.lang.String r0 = r14.A02
            r1.Dhl(r0)
            r0 = -43838517(0xfffffffffd6313cb, float:-1.8864845E37)
            goto L_0x03c1
        L_0x00b4:
            r0 = 320679789(0x131d2f6d, float:1.9839569E-27)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.K6q r0 = (X.C61419K6q) r0
            X.0eM r0 = r0.A07
            java.lang.Object r1 = r0.getValue()
            X.JjH r1 = (X.C60314JjH) r1
            java.lang.String r4 = r14.A02
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.05G r2 = r1.A0D
            r1 = 0
            X.Jyu r0 = new X.Jyu
            r0.<init>(r4, r1)
            r2.Epw(r0)
            r0 = -56842511(0xfffffffffc9ca6f1, float:-6.507074E36)
            goto L_0x03c1
        L_0x00dd:
            r0 = 1488839872(0x58bde4c0, float:1.67032137E15)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r14.A01
            com.instagram.bugreporter.BugReportComposerFragment r7 = (com.instagram.bugreporter.BugReportComposerFragment) r7
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x00ff
            X.0f9 r2 = X.JTU.A0B()
            java.lang.String r1 = "message"
            java.lang.String r0 = "Ignoring bug composer video click because we are processing an action"
            r2.ABQ(r1, r0)
            r2.report()
        L_0x00fa:
            r0 = -998031311(0xffffffffc4834031, float:-1050.006)
            goto L_0x024d
        L_0x00ff:
            java.lang.String r5 = r14.A02
            androidx.fragment.app.FragmentActivity r4 = r7.getActivity()
            X.0wW r0 = r7.getSession()
            java.lang.String r1 = r0.getToken()
            boolean r3 = X.AnonymousClass7TG.A1Z(r5, r1)
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r2.putString(r0, r1)
            r0 = 2535(0x9e7, float:3.552E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putString(r0, r5)
            X.Ubg r1 = new X.Ubg
            r1.<init>()
            r1.setArguments(r2)
            if (r4 == 0) goto L_0x013b
            X.0wW r0 = r7.getSession()
            X.6Yo r0 = X.DbV.A0M(r1, r4, r0)
            r0.A0E = r3
            r0.A04()
            goto L_0x00fa
        L_0x013b:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x0140:
            r0 = -1674526907(0xffffffff9c30bf45, float:-5.8480725E-22)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.Jkh r0 = (X.C60388Jkh) r0
            X.L0q r0 = r0.A01
            java.lang.String r5 = r14.A02
            r2 = 0
            X.K66 r4 = r0.A00
            X.27r r1 = X.JTP.A0X(r4)
            X.80P r0 = X.AnonymousClass80P.CONTENT_BASED_HASHTAG_SUGGESTION
            r1.A1X(r0)
            X.LBG r0 = r4.A06
            java.lang.String r9 = "viewHolder"
            if (r0 == 0) goto L_0x01f5
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r0 = r0.A0A
            java.lang.String r8 = X.AnonymousClass7TF.A0f(r0)
            if (r8 != 0) goto L_0x01d1
            r6 = 0
        L_0x016a:
            com.instagram.common.session.UserSession r7 = X.JTP.A0S(r4, r2)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36604992651924644(0x820c0c000614a4, double:3.212482977327134E-306)
            int r7 = X.DbS.A04(r2, r7, r0)
            X.LBG r0 = r4.A06
            if (r0 == 0) goto L_0x01f5
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r2 = r0.A0A
            r0 = 35
            boolean r0 = X.00l.A0Y(r8, r0)
            r1 = 1
            if (r0 == 0) goto L_0x01cf
            int r0 = r5.length()
            java.lang.CharSequence r0 = r5.subSequence(r1, r0)
        L_0x0190:
            r2.append(r0)
            X.LBG r0 = r4.A06
            if (r0 == 0) goto L_0x01f5
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r1 = r0.A0A
            java.lang.String r0 = " "
            r1.append(r0)
            if (r7 <= 0) goto L_0x01a2
            if (r6 >= r7) goto L_0x01c4
        L_0x01a2:
            X.LQj r2 = r4.A03
            if (r2 == 0) goto L_0x01c4
            java.util.List r1 = X.AnonymousClass7TE.A1I(r5)
            java.util.Set r0 = r2.A06
            r0.addAll(r1)
            java.util.List r1 = X.C64146LQj.A00(r2)
            if (r1 == 0) goto L_0x01c9
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01c9
            X.Jkh r0 = r2.A00
            if (r0 == 0) goto L_0x01c4
            r0.A00 = r1
            r0.notifyDataSetChanged()
        L_0x01c4:
            r0 = 1132232650(0x437c7fca, float:252.49918)
            goto L_0x03c1
        L_0x01c9:
            X.0sa r0 = r2.A07
            r0.invoke()
            goto L_0x01c4
        L_0x01cf:
            r0 = r5
            goto L_0x0190
        L_0x01d1:
            java.util.ArrayList r1 = X.C253063q9.A00(r8)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            int r6 = r0.size()
            goto L_0x016a
        L_0x01df:
            java.lang.Object r1 = r15.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            int r5 = X.DbW.A04(r1, r0)
            java.lang.String r4 = r14.A02
            androidx.fragment.app.FragmentActivity r3 = r7.getActivity()
            X.Pwg r1 = r7.A07
            if (r1 != 0) goto L_0x01fd
            java.lang.String r9 = "userFlowLoggerV2"
        L_0x01f5:
            X.0qQ.A0F(r9)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x01fd:
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "ImageAnnotationFragment.imagePath"
            r2.putString(r0, r4)
            android.os.Bundle r0 = r1.E2f()
            r2.putAll(r0)
            X.K4v r1 = new X.K4v
            r1.<init>()
            r1.setArguments(r2)
            com.instagram.bugreporter.BugReportComposerFragment$onClickScreenshotThumbnail$1 r0 = new com.instagram.bugreporter.BugReportComposerFragment$onClickScreenshotThumbnail$1
            r0.<init>(r7, r5)
            r1.A00 = r0
            if (r3 == 0) goto L_0x0251
            X.0wW r0 = r7.getSession()
            X.6Yo r1 = X.DbV.A0M(r1, r3, r0)
            r0 = 1
            r1.A0E = r0
            r1.A04()
            goto L_0x024a
        L_0x022d:
            r0 = 1035562258(0x3db96d12, float:0.09054007)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r14.A01
            com.instagram.bugreporter.BugReportComposerFragment r7 = (com.instagram.bugreporter.BugReportComposerFragment) r7
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x01df
            X.0f9 r2 = X.JTU.A0B()
            java.lang.String r1 = "message"
            java.lang.String r0 = "Ignoring bug composer screenshot click because we are processing an action"
            r2.ABQ(r1, r0)
            r2.report()
        L_0x024a:
            r0 = -191773846(0xfffffffff491c36a, float:-9.238849E31)
        L_0x024d:
            X.AnonymousClass0fD.A0C(r0, r6)
            return
        L_0x0251:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x0256:
            r0 = 1913162686(0x72088bbe, float:2.7045696E30)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.Jkq r0 = (X.C60397Jkq) r0
            X.0sP r1 = r0.A03
            java.lang.String r0 = r14.A02
            r1.invoke(r0)
            r0 = 1204448790(0x47ca6e16, float:103644.17)
            goto L_0x03e5
        L_0x026d:
            r0 = -776733043(0xffffffffd1b3fe8d, float:-9.6633725E10)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r14.A01
            X.KXg r4 = (X.KXg) r4
            X.0eM r0 = r4.A0A
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.LFo r0 = new X.LFo
            r0.<init>(r4, r1)
            java.lang.String r2 = r14.A02
            r3 = 0
            X.0wc r1 = r0.A00
            java.lang.String r0 = "instagram_action_private_list"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x02a0
            java.lang.String r0 = "rename_list"
            X.C60781JrC.A00(r1, r0)
            r0 = 0
            X.DbS.A1F(r0, r1)
            X.JTU.A0z(r1, r2, r0)
        L_0x02a0:
            r0 = 1
            r4.A04 = r0
            android.view.View r1 = r4.requireView()
            r0 = 2131435553(0x7f0b2021, float:1.8492951E38)
            android.view.View r2 = X.AnonymousClass7TF.A0F(r1, r0)
            android.widget.EditText r2 = (android.widget.EditText) r2
            android.view.View r1 = r4.requireView()
            r0 = 2131432227(0x7f0b1323, float:1.8486205E38)
            X.Dbb.A0t(r1, r0, r3)
            r2.requestFocus()
            int r0 = r2.length()
            r2.setSelection(r0)
            X.0nA.A0Q(r2)
            r0 = -2097573381(0xffffffff82f991fb, float:-3.667105E-37)
            goto L_0x03e5
        L_0x02cc:
            r0 = 1536596001(0x5b969821, float:8.4777028E16)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r14.A01
            X.KXg r6 = (X.KXg) r6
            X.0eM r0 = r6.A0A
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.LFo r0 = new X.LFo
            r0.<init>(r6, r1)
            java.lang.String r4 = r14.A02
            X.0wc r1 = r0.A00
            java.lang.String r0 = "instagram_action_private_list"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x02fe
            java.lang.String r0 = "delete_list"
            X.C60781JrC.A00(r1, r0)
            r0 = 0
            X.DbS.A1F(r0, r1)
            X.JTU.A0z(r1, r4, r0)
        L_0x02fe:
            X.8ab r3 = X.Dba.A0H(r6)
            r0 = 2131957566(0x7f13173e, float:1.955172E38)
            java.lang.String r0 = r6.getString(r0)
            r3.A05 = r0
            r0 = 2131957565(0x7f13173d, float:1.9551718E38)
            java.lang.String r0 = r6.getString(r0)
            r3.A0q(r0)
            r2 = 2131957531(0x7f13171b, float:1.9551649E38)
            r0 = 2
            X.LV1 r1 = new X.LV1
            r1.<init>((java.lang.String) r4, (java.lang.Object) r6, (int) r0)
            X.8ae r0 = X.C358278ae.RED
            r3.A0Q(r1, r0, r2)
            X.LUf r0 = X.C64215LUf.A00
            r3.A0C(r0)
            r0 = 1
            X.AnonymousClass7TH.A0a(r3, r0)
            r0 = 618795388(0x24e2117c, float:9.8041496E-17)
            goto L_0x03e5
        L_0x0331:
            r0 = -77854292(0xfffffffffb5c09ac, float:-1.1425015E36)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.Kb4 r0 = (X.Kb4) r0
            X.MRg r1 = r0.A00
            if (r1 == 0) goto L_0x034a
            X.0qQ.A0A(r15)
            java.lang.String r0 = r14.A02
            if (r0 == 0) goto L_0x034f
            r1.DK0(r15, r0)
        L_0x034a:
            r0 = -1365580771(0xffffffffae9ae41d, float:-7.04363E-11)
            goto L_0x03e5
        L_0x034f:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 1995147684(0x76eb89a4, float:2.3886356E33)
            X.AnonymousClass0fD.A0C(r0, r5)
            throw r1
        L_0x035a:
            r0 = -1420820408(0xffffffffab500048, float:-7.3896835E-13)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r14.A01
            X.2YL r3 = (X.2YL) r3
            java.lang.String r2 = r14.A02
            X.6oS r1 = X.C318116oQ.A00(r3)
            r0 = 21
            X.MGE.A01(r3, r2, r1, r0)
            r0 = -2065474947(0xffffffff84e35a7d, float:-5.3450544E-36)
            goto L_0x03e5
        L_0x0374:
            r0 = 1002401806(0x3bbf700e, float:0.0058422154)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r14.A01
            X.K87 r5 = (X.K87) r5
            X.0eM r2 = r5.A04
            java.lang.Object r1 = r2.getValue()
            X.Jhx r1 = (X.C60240Jhx) r1
            java.lang.String r0 = r14.A02
            r1.A03 = r0
            r7 = 0
            com.instagram.api.schemas.BrandedContentGatingInfo r6 = new com.instagram.api.schemas.BrandedContentGatingInfo
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.Object r4 = r2.getValue()
            X.Jhx r4 = (X.C60240Jhx) r4
            boolean r0 = X.C63982LHa.A00(r6)
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x03c5
            r0 = 2131968777(0x7f134309, float:1.9574458E38)
            java.lang.String r1 = r5.getString(r0)
        L_0x03aa:
            X.0qQ.A0A(r1)
            boolean r0 = X.C63982LHa.A01(r6)
            if (r0 == 0) goto L_0x03bb
            android.content.Context r0 = r5.requireContext()
            java.lang.String r2 = X.C49946FGa.A03(r0, r6)
        L_0x03bb:
            r4.A00(r6, r1, r2)
            r0 = 2124988969(0x7ea8c229, float:1.1215922E38)
        L_0x03c1:
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        L_0x03c5:
            r1 = r2
            goto L_0x03aa
        L_0x03c7:
            r0 = 2005801734(0x778e1b06, float:5.7644864E33)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.KGA r0 = (X.KGA) r0
            androidx.fragment.app.FragmentActivity r4 = r0.A01
            com.instagram.common.session.UserSession r3 = r0.A04
            X.0iw r0 = r0.A03
            java.lang.String r2 = r0.getModuleName()
            java.lang.String r1 = r14.A02
            r0 = 0
            X.C49950FGf.A05(r4, r3, r2, r1, r0)
            r0 = 1642034593(0x61df75a1, float:5.152625E20)
        L_0x03e5:
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LXK.onClick(android.view.View):void");
    }
}
