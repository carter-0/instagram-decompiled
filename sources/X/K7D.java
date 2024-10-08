package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.List;

public final class K7D extends AnonymousClass4DH implements G9c {
    public static final String __redex_internal_original_name = "AvatarMentionsBottomSheetFragment";
    public RecyclerView A00;
    public AnonymousClass2t9 A01;
    public IgTextView A02;
    public C331157Pu A03;
    public SpinnerImageView A04;
    public User A05;
    public String A06;
    public String A07;
    public String A08;
    public List A09;
    public List A0A;
    public boolean A0B;
    public String A0C;
    public String A0D;
    public final C267624bv A0E = new C50195FTb(this, 5);
    public final AnonymousClass0eM A0F = C227642jf.A02(this);
    public final AnonymousClass0eM A0G;

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            r14 = this;
            r2 = 0
            X.0qQ.A0B(r15, r2)
            r7 = r14
            r0 = r16
            super.onViewCreated(r15, r0)
            r0 = 2131428442(0x7f0b045a, float:1.8478529E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r15, r0)
            r14.A02 = r0
            r0 = 2131428447(0x7f0b045f, float:1.8478539E38)
            androidx.recyclerview.widget.RecyclerView r0 = X.DbT.A0I(r15, r0)
            r14.A00 = r0
            r0 = 2131428444(0x7f0b045c, float:1.8478533E38)
            android.view.View r0 = r15.requireViewById(r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = (com.instagram.ui.widget.spinner.SpinnerImageView) r0
            r14.A04 = r0
            X.2tC r3 = X.DbV.A0S(r14)
            X.0eM r1 = r14.A0F
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r9 = r14.getModuleName()
            androidx.fragment.app.FragmentActivity r6 = r14.requireActivity()
            java.util.List r10 = r14.A09
            r0 = 4
            X.MIp r11 = new X.MIp
            r11.<init>(r14, r0)
            X.Uj6 r5 = new X.Uj6
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.2t9 r3 = X.DbU.A0U(r3, r5)
            r14.A01 = r3
            androidx.recyclerview.widget.RecyclerView r0 = r14.A00
            if (r0 == 0) goto L_0x0053
            r0.setAdapter(r3)
        L_0x0053:
            androidx.recyclerview.widget.RecyclerView r4 = r14.A00
            if (r4 == 0) goto L_0x005f
            android.content.Context r3 = r14.requireContext()
            r0 = 1
            X.DbU.A15(r3, r4, r0, r2)
        L_0x005f:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            com.instagram.avatars.store.AvatarStore r0 = X.25x.A00(r0)
            X.27E r0 = r0.A01
            X.27H r3 = r0.A00
            X.5vi r0 = X.C299715vi.A00
            boolean r6 = X.0qQ.A0K(r3, r0)
            com.instagram.common.ui.base.IgTextView r5 = r14.A02
            if (r5 == 0) goto L_0x0088
            android.content.res.Resources r4 = X.DbV.A05(r14)
            if (r6 == 0) goto L_0x00fa
            boolean r3 = r14.A0B
            r0 = 2131953469(0x7f13073d, float:1.954341E38)
            if (r3 == 0) goto L_0x0085
            r0 = 2131953468(0x7f13073c, float:1.9543408E38)
        L_0x0085:
            X.DbU.A1A(r4, r5, r0)
        L_0x0088:
            boolean r0 = r14.A0B
            if (r0 != 0) goto L_0x00ee
            if (r6 == 0) goto L_0x00ee
            com.instagram.common.ui.base.IgTextView r4 = r14.A02
            if (r4 == 0) goto L_0x009c
            r0 = 19
            X.FP2 r3 = new X.FP2
            r3.<init>((java.lang.Object) r14, (int) r0)
        L_0x0099:
            X.AnonymousClass0fU.A00(r3, r4)
        L_0x009c:
            X.07U r9 = X.07U.A05
            X.07Z r11 = r14.getViewLifecycleOwner()
            X.0xx r0 = X.AnonymousClass07a.A00(r11)
            r12 = 0
            r13 = 23
            X.MH5 r8 = new X.MH5
            r10 = r14
            r8.<init>(r9, r10, r11, r12, r13)
            X.19B r5 = X.19B.A00
            X.1Eo.A05(r5, r8, r0)
            java.lang.String r3 = r14.A0C
            if (r3 == 0) goto L_0x00d5
            X.0lg r0 = X.AnonymousClass7TF.A0L(r1, r2)
            X.0wc r1 = X.AnonymousClass0kN.A02(r0)
            java.lang.String r0 = "avatar_mentions_users_list_bottom_sheet_impression"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x00d5
            java.lang.String r0 = "entry_point"
            java.util.Map r0 = X.AnonymousClass7TF.A0w(r0, r3)
            X.DbV.A1L(r1, r0)
        L_0x00d5:
            java.util.List r4 = r14.A0A
            if (r4 == 0) goto L_0x00ed
            X.0eM r0 = r14.A0G
            X.2YL r3 = X.DbS.A0H(r0)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 35
            X.MGd r0 = new X.MGd
            r0.<init>(r3, r4, r12, r1)
            X.1Eo.A05(r5, r0, r2)
        L_0x00ed:
            return
        L_0x00ee:
            com.instagram.common.ui.base.IgTextView r4 = r14.A02
            if (r4 == 0) goto L_0x009c
            r0 = 8
            X.FOq r3 = new X.FOq
            r3.<init>((int) r0, (java.lang.Object) r14, (boolean) r6)
            goto L_0x0099
        L_0x00fa:
            r0 = 2131953467(0x7f13073b, float:1.9543406E38)
            goto L_0x0085
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K7D.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final Integer BkZ() {
        return AnonymousClass05K.A01;
    }

    public final String getModuleName() {
        String str = this.A0D;
        if (str != null) {
            return C49092EpH.A00(this, str);
        }
        0qQ.A0F("previousModuleName");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0F);
    }

    public K7D() {
        MJ1 mj1 = new MJ1(this, 25);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MJ1(new MJ1(this, 22), 23));
        this.A0G = DbS.A0I(new MJ1(A002, 24), mj1, new MJ8(8, (Object) null, A002), DbS.A0z(C60140JgL.class));
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(102195370);
        K7D.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("args_previous_module_name");
        if (string != null) {
            this.A0D = string;
            String string2 = requireArguments.getString(AnonymousClass000.A00(43));
            if (string2 != null) {
                this.A08 = string2;
                this.A0B = requireArguments.getBoolean(C273654mx.A00(1488));
                this.A06 = requireArguments.getString(C273654mx.A00(1482));
                this.A07 = requireArguments.getString(C273654mx.A00(1483));
                this.A05 = requireArguments.getParcelable(C273654mx.A00(1484));
                this.A0C = requireArguments.getString("args_entry_point");
                AnonymousClass0fD.A09(967656681, A022);
                return;
            }
            illegalStateException = AnonymousClass7TE.A0z(AnonymousClass000.A00(3042));
            i = -1221505849;
        } else {
            illegalStateException = AnonymousClass7TE.A0z("previous module required");
            i = 1036552306;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(885523768);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.avatar_mentions_bottom_sheet_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-26681902, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1881165290);
        super.onDestroyView();
        this.A02 = null;
        this.A00 = null;
        this.A04 = null;
        AnonymousClass0fD.A09(-844168270, A022);
    }
}
