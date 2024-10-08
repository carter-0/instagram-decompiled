package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.reels.question.model.QuestionResponseModel;
import com.instagram.reels.question.model.QuestionResponseReshareModel;
import com.instagram.reels.question.model.QuestionResponsesModel;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import com.instagram.user.model.User;

/* renamed from: X.UZj  reason: case insensitive filesystem */
public final class C15281UZj extends AnonymousClass4DH implements AnonymousClass4DS, XBy {
    public static final String __redex_internal_original_name = "QuestionResponseListFragment";
    public UAH A00;
    public C17490VXt A01;
    public C17836Vgp A02;
    public C249763kK A03;
    public String A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);

    public final String getModuleName() {
        return AnonymousClass000.A00(271);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView A0c = JTR.A0c(view, R.id.question_responses_list);
        int dimensionPixelSize = DbV.A05(this).getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
        C17836Vgp vgp = this.A02;
        if (vgp == null) {
            0qQ.A0F("questionResponsesListHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        vgp.A00(A0c, dimensionPixelSize, dimensionPixelSize);
        07U r2 = 07U.A04;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MH4(r2, this, viewLifecycleOwner, (AnonymousClass4D7) null, 14), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0074, code lost:
        if (X.1YZ.A02 == null) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Db9(X.C17801VgE r34, int r35) {
        /*
            r33 = this;
            r22 = 0
            r4 = r33
            X.0eM r1 = r4.A05
            X.1E8 r2 = X.DbX.A0d(r1)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            X.0t1 r3 = X.0eE.A00(r0)
            X.0wc r1 = X.DbX.A0P(r4, r1)
            r0 = 660(0x294, float:9.25E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = r4.A04
            X.1Xj r8 = r2.A02(r0)
            if (r8 == 0) goto L_0x0221
            X.VXt r2 = r4.A01
            r15 = 0
            if (r2 != 0) goto L_0x0037
            java.lang.String r0 = "questionResponderMoreOptionsHelper"
        L_0x002f:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0037:
            com.instagram.user.model.User r11 = r3.A00()
            r9 = 1
            r6 = r34
            com.instagram.reels.question.model.QuestionResponseModel r0 = r6.A00
            X.0qQ.A07(r0)
            com.instagram.user.model.User r7 = r0.A04
            X.4DH r3 = r2.A01
            android.content.Context r0 = r3.requireContext()
            androidx.fragment.app.FragmentActivity r5 = r3.requireActivity()
            com.instagram.common.session.UserSession r10 = r2.A03
            java.lang.String r3 = X.C51973G9u.A0j(r10, r8)
            boolean r14 = X.DbV.A1Z(r11, r3)
            java.lang.String r3 = r7.getId()
            boolean r13 = X.DbV.A1Z(r11, r3)
            com.instagram.user.model.FollowStatus r11 = r7.B6o()
            com.instagram.user.model.FollowStatus r3 = com.instagram.user.model.FollowStatus.A05
            boolean r12 = X.AnonymousClass7TF.A1W(r11, r3)
            boolean r3 = r7.isRestricted()
            if (r3 == 0) goto L_0x0076
            X.1YZ r3 = X.1YZ.A02
            r11 = 1
            if (r3 != 0) goto L_0x0077
        L_0x0076:
            r11 = 0
        L_0x0077:
            X.Hto r3 = new X.Hto
            r3.<init>(r10)
            if (r13 != 0) goto L_0x01cb
            if (r14 != 0) goto L_0x01cb
            r10 = 271(0x10f, float:3.8E-43)
            java.lang.String r20 = X.AnonymousClass000.A00(r10)
            java.lang.String r19 = r7.getUsername()
            com.instagram.common.typedurl.ImageUrl r17 = r7.Bh3()
            X.H7k r18 = new X.H7k
            r23 = r18
            r24 = r9
            r25 = r0
            r26 = r7
            r27 = r5
            r28 = r2
            r23.<init>(r24, r25, r26, r27, r28)
            r21 = 1065353216(0x3f800000, float:1.0)
            X.VcG r14 = new X.VcG
            r16 = r15
            r23 = r9
            r24 = r22
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            java.util.List r10 = r3.A07
            r10.add(r14)
            r3.A06(r9)
            r10 = 2131972207(0x7f13506f, float:1.9581415E38)
            java.lang.String r26 = X.AnonymousClass7TE.A16(r0, r10)
            X.WBF r25 = new X.WBF
            r16 = r25
            r17 = r9
            r18 = r2
            r19 = r4
            r20 = r5
            r21 = r6
            r16.<init>((int) r17, (java.lang.Object) r18, (java.lang.Object) r19, (java.lang.Object) r20, (java.lang.Object) r21)
            r16 = -1
            r23 = r3
            r24 = r0
            r27 = r15
            r29 = r9
            r28 = r16
            r23.A03(r24, r25, r26, r27, r28, r29)
            if (r12 == 0) goto L_0x0100
            if (r11 == 0) goto L_0x01a8
            r6 = 2131975971(0x7f135f23, float:1.958905E38)
            java.lang.String r26 = X.AnonymousClass7TE.A16(r0, r6)
            r32 = 2
            X.WBF r25 = new X.WBF
            r27 = r25
            r28 = r0
            r29 = r2
            r30 = r4
            r31 = r7
            r27.<init>((android.content.Context) r28, (X.C17490VXt) r29, (X.AnonymousClass0iw) r30, (com.instagram.user.model.User) r31, (int) r32)
            r27 = r15
            r29 = r9
            r28 = r16
            r23.A03(r24, r25, r26, r27, r28, r29)
        L_0x0100:
            r6 = 2131953909(0x7f1308f5, float:1.9544302E38)
            java.lang.String r26 = X.AnonymousClass7TE.A16(r0, r6)
            r32 = 4
            X.WBF r25 = new X.WBF
            r27 = r25
            r28 = r0
            r29 = r2
            r30 = r4
            r31 = r7
            r27.<init>((android.content.Context) r28, (X.C17490VXt) r29, (X.AnonymousClass0iw) r30, (com.instagram.user.model.User) r31, (int) r32)
            r27 = r15
            r29 = r9
            r28 = r16
            r23.A03(r24, r25, r26, r27, r28, r29)
            if (r12 == 0) goto L_0x0191
            r6 = 2131975854(0x7f135eae, float:1.9588812E38)
            java.lang.String r14 = X.AnonymousClass7TE.A16(r0, r6)
            r9 = 16
            X.WB4 r6 = new X.WB4
            r6.<init>(r9, r5, r7, r2)
            r11 = r3
            r12 = r0
            r13 = r6
            r17 = r22
            r11.A03(r12, r13, r14, r15, r16, r17)
        L_0x0139:
            r2 = 2131954722(0x7f130c22, float:1.9545951E38)
            java.lang.String r14 = X.AnonymousClass7TE.A16(r0, r2)
            r6 = 22
            X.WB8 r2 = new X.WB8
            r2.<init>((java.lang.Object) r5, (int) r6)
            r13 = r2
            r17 = r22
            r11.A03(r12, r13, r14, r15, r16, r17)
            X.Vho r2 = new X.Vho
            r2.<init>(r3)
            r2.A00(r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0221
            java.lang.String r2 = "menu_option_tap"
            r0 = 727(0x2d7, float:1.019E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.AAJ(r0, r2)
            r0 = 994(0x3e2, float:1.393E-42)
            java.lang.String r2 = X.C273654mx.A00(r0)
            r0 = 728(0x2d8, float:1.02E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.AAJ(r0, r2)
            r0 = 271(0x10f, float:3.8E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "containermodule"
            r1.AAJ(r0, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r35)
            java.lang.String r0 = "media_index"
            r1.A8k(r0, r2)
            X.3kK r0 = r4.A03
            if (r0 != 0) goto L_0x01e5
            java.lang.String r0 = "sessionIdProvider"
            goto L_0x002f
        L_0x0191:
            r6 = 2131962612(0x7f132af4, float:1.9561954E38)
            java.lang.String r14 = X.AnonymousClass7TE.A16(r0, r6)
            r9 = 17
            X.WB4 r6 = new X.WB4
            r6.<init>(r9, r5, r7, r2)
            r11 = r3
            r12 = r0
            r13 = r6
            r17 = r22
            r11.A03(r12, r13, r14, r15, r16, r17)
            goto L_0x0139
        L_0x01a8:
            r6 = 2131972302(0x7f1350ce, float:1.9581608E38)
            java.lang.String r26 = X.AnonymousClass7TE.A16(r0, r6)
            r32 = 3
            X.WBF r25 = new X.WBF
            r27 = r25
            r28 = r0
            r29 = r2
            r30 = r4
            r31 = r7
            r27.<init>((android.content.Context) r28, (X.C17490VXt) r29, (X.AnonymousClass0iw) r30, (com.instagram.user.model.User) r31, (int) r32)
            r27 = r15
            r29 = r9
            r28 = r16
            r23.A03(r24, r25, r26, r27, r28, r29)
            goto L_0x0100
        L_0x01cb:
            r7 = 2131971035(0x7f134bdb, float:1.9579038E38)
            java.lang.String r14 = X.AnonymousClass7TE.A16(r0, r7)
            r10 = 15
            X.WB4 r7 = new X.WB4
            r7.<init>(r10, r0, r6, r2)
            r16 = -1
            r11 = r3
            r12 = r0
            r13 = r7
            r17 = r9
            r11.A03(r12, r13, r14, r15, r16, r17)
            goto L_0x0139
        L_0x01e5:
            java.lang.String r2 = r0.getSessionId()
            if (r2 != 0) goto L_0x01ed
            java.lang.String r2 = ""
        L_0x01ed:
            java.lang.String r0 = "viewer_session_id"
            r1.AAJ(r0, r2)
            java.lang.String r0 = r8.A2n()
            if (r0 == 0) goto L_0x0222
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
            if (r0 == 0) goto L_0x0222
            long r2 = r0.longValue()
        L_0x0202:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "media_id"
            r1.A9F(r0, r2)
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r8)
            if (r0 == 0) goto L_0x0215
            java.lang.Long r15 = X.C51972G9s.A0h(r0)
        L_0x0215:
            r0 = 165(0xa5, float:2.31E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.A9F(r0, r15)
            r1.Cgf()
        L_0x0221:
            return
        L_0x0222:
            r2 = 0
            goto L_0x0202
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15281UZj.Db9(X.VgE, int):void");
    }

    public final void DbB(C17801VgE vgE, int i) {
        1Xj A022;
        AnonymousClass0eM r4 = this.A05;
        0wc A0P = DbX.A0P(this, r4);
        1E8 A0d = DbX.A0d(r4);
        0Aj A0e = AnonymousClass7TE.A0e(A0P, AnonymousClass000.A00(660));
        if (A0e.isSampled() && (A022 = A0d.A02(this.A04)) != null) {
            A0e.AAJ(AnonymousClass000.A00(727), "question_sticker_reply");
            A0e.AAJ(AnonymousClass000.A00(728), "question_sticker_response_sheet");
            A0e.AAJ("containermodule", AnonymousClass000.A00(271));
            A0e.A8k("media_index", Integer.valueOf(i));
            C249763kK r0 = this.A03;
            Long l = null;
            if (r0 == null) {
                0qQ.A0F("sessionIdProvider");
                throw AnonymousClass00P.createAndThrow();
            }
            String sessionId = r0.getSessionId();
            if (sessionId == null) {
                sessionId = "";
            }
            A0e.AAJ("viewer_session_id", sessionId);
            A0e.A9F("media_id", C51972G9s.A0j(A022.getId()));
            User A11 = C51966G9m.A11(A022);
            if (A11 != null) {
                l = C51972G9s.A0h(A11);
            }
            A0e.A9F(C273654mx.A00(165), l);
            A0e.Cgf();
        }
        FragmentActivity requireActivity = requireActivity();
        0lg A0X = DbT.A0X(r4);
        C17801VgE vgE2 = vgE;
        int A002 = vgE2.A00();
        QuestionResponsesModel questionResponsesModel = vgE2.A01;
        String str = questionResponsesModel.A08;
        0qQ.A07(str);
        String str2 = vgE2.A00.A07;
        String str3 = questionResponsesModel.A07;
        0qQ.A07(str3);
        QuestionResponseType questionResponseType = vgE2.A00.A02;
        0qQ.A07(questionResponseType);
        QuestionResponseModel questionResponseModel = vgE2.A00;
        String str4 = questionResponseModel.A08;
        if (str4 == null) {
            str4 = "";
        }
        QuestionResponseReshareModel questionResponseReshareModel = new QuestionResponseReshareModel(questionResponseModel.A01, questionResponseType, questionResponseModel.A03, questionResponsesModel.A03, vgE2.A00.A04, str, str2, str3, str4, questionResponseModel.A04.getId(), A002, true);
        28D r42 = 28D.A0u;
        0qQ.A0B(A0X, 2);
        C56044Hrt A0C = C250563lf.A0C(r42);
        A0C.A0D = questionResponseReshareModel;
        AnonymousClass6W8.A02(requireActivity, A0C.A00(), A0X, TransparentModalActivity.class, AnonymousClass000.A00(1176)).A0D(this, 9587);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final void configureActionBar(2da r3) {
        DbW.A1C(r3, JTT.A0B(this, r3).getResources().getString(2131971595));
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.07Z, X.UZj, androidx.fragment.app.Fragment, X.4DH] */
    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(-328633929);
        C15281UZj.super.onCreate(bundle);
        this.A04 = requireArguments().getString(AnonymousClass000.A00(2413));
        this.A03 = AnonymousClass1L1.A01.A01(requireArguments().getString(AnonymousClass000.A00(896)));
        String string = requireArguments().getString(AnonymousClass000.A00(2414));
        AnonymousClass0eM r2 = this.A05;
        C17836Vgp vgp = new C17836Vgp(this, AnonymousClass7TE.A0l(r2), this, AnonymousClass05K.A01, this.A04, string);
        this.A02 = vgp;
        UAH uah = vgp.A01;
        this.A00 = uah;
        if (uah == null) {
            str = "adapter";
        } else {
            uah.setHasStableIds(true);
            C17836Vgp vgp2 = this.A02;
            if (vgp2 == null) {
                str = "questionResponsesListHelper";
            } else {
                vgp2.A02.A00(true);
                this.A01 = new C17490VXt(AnonymousClass07i.A00(this), this, AnonymousClass7TE.A0l(r2));
                AnonymousClass0fD.A09(2054094338, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1594290357);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_question_responses_list, viewGroup, false);
        AnonymousClass0fD.A09(-1266063324, A022);
        return inflate;
    }
}
