package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.NIv  reason: case insensitive filesystem */
public final class C68457NIv extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "DirectManageFoldersFragment";
    public View A00;
    public RecyclerView A01;
    public AnonymousClass2t9 A02;
    public C70933OSg A03;
    public IgdsBanner A04;
    public final C355568Qm A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final AnonymousClass0eM A07;
    public final String A08 = "direct_manage_folders";

    public final void configureActionBar(2da r4) {
        String string;
        0qQ.A0B(r4, 0);
        r4.Eom(2131959716);
        int i = 1;
        r4.Eu4(true);
        if (((JV5) ((C67740Mtt) this.A07.getValue()).A05.getValue()).A01) {
            string = getString(2131959680);
        } else {
            string = getString(2131959715);
            i = 2;
        }
        r4.Eiy(string, C71401Ok0.A00(this, i));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = DbT.A0I(view, R.id.folder_list);
        this.A00 = view.requireViewById(R.id.folder_info_button);
        this.A04 = (IgdsBanner) view.requireViewById(R.id.folder_nux_banner);
        AnonymousClass2tC A0S = DbV.A0S(this);
        A0S.A01(new C68619NPp(requireContext(), new C74184PqQ(this, 34)));
        this.A02 = DbU.A0U(A0S, new C68612NPi(new C46570DhC(this, 46)));
        RecyclerView recyclerView = this.A01;
        String str = "recyclerView";
        if (recyclerView != null) {
            DbY.A16(this, recyclerView);
            RecyclerView recyclerView2 = this.A01;
            if (recyclerView2 != null) {
                recyclerView2.A0S = true;
                AnonymousClass2t9 r0 = this.A02;
                if (r0 == null) {
                    str = "adapter";
                } else {
                    recyclerView2.setAdapter(r0);
                    View view2 = this.A00;
                    if (view2 == null) {
                        str = "infoButton";
                    } else {
                        AnonymousClass0fU.A00(new FPI((Object) this, 50), view2);
                        IgdsBanner igdsBanner = this.A04;
                        if (igdsBanner == null) {
                            str = "nuxBanner";
                        } else {
                            igdsBanner.A00 = new C50468FcG(this, 1);
                            07U r3 = 07U.A05;
                            AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
                            AnonymousClass7TE.A1Z(new C66171MGi(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 45), AnonymousClass07a.A00(viewLifecycleOwner));
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return this.A08;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public C68457NIv() {
        C67570Mq4 mq4 = new C67570Mq4(this, 0);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C46570DhC(new C46570DhC(this, 47), 48));
        this.A07 = DbS.A0I(new C46570DhC(A002, 49), mq4, C73915Plq.A00(A002, (Object) null, 26), DbS.A0z(C67740Mtt.class));
        this.A05 = new C355568Qm(new U9V(new C59110J6s(this, 23)));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1961772100);
        C68457NIv.super.onCreate(bundle);
        this.A03 = new C70933OSg(AnonymousClass7TE.A0l(this.A06));
        2YL A0H = DbS.A0H(this.A07);
        C66583MXo.A1O(A0H, C318116oQ.A00(A0H), 48);
        C70933OSg oSg = this.A03;
        if (oSg == null) {
            0qQ.A0F("logger");
            throw AnonymousClass00P.createAndThrow();
        }
        String string = requireArguments().getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (string == null) {
            string = "unknown";
        }
        C70933OSg.A00(oSg, "inbox_folders_manage_screen_impression", AnonymousClass7TF.A0w(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, string));
        AnonymousClass0fD.A09(-1475660537, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1683674352);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.direct_manage_folders_fragment, false);
        AnonymousClass0fD.A09(1696662934, A022);
        return A0D;
    }
}
