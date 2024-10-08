package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.reels.Reel;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.io.IOException;

@Deprecated
/* renamed from: X.6ih  reason: invalid class name and case insensitive filesystem */
public final class C314696ih implements C317216mu {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final C273384mU A04;
    public final Fragment A05;

    public final void Cxd() {
    }

    public final void DBK() {
        this.A01 = true;
        C250973mM r0 = ((ReelViewerFragment) this.A04).A0a;
        r0.getClass();
        String id = r0.A0H.getId();
        UserSession userSession = this.A03;
        Bundle bundle = new Bundle();
        bundle.putString("edit_highlights_reel_id", id);
        bundle.putBoolean("archive_multi_select_mode", true);
        bundle.putBoolean("edit_highlights_is_suggested_highlight", true);
        bundle.putSerializable("highlight_management_source", Ki3.STORY_VIEWER_EDIT_SUGGESTED_HIGHLIGHT);
        Fragment fragment = this.A05;
        new AnonymousClass6W8(fragment.requireActivity(), bundle, userSession, ModalActivity.class, "manage_highlights").A0D(fragment, 201);
    }

    public final void Daw() {
        this.A00 = true;
        Fragment fragment = this.A05;
        Context requireContext = fragment.requireContext();
        AnonymousClass6ST r2 = new AnonymousClass6ST(requireContext);
        r2.A00(fragment.requireContext().getResources().getString(2131970974));
        AnonymousClass0fN.A00(r2);
        C250973mM r0 = ((ReelViewerFragment) this.A04).A0a;
        r0.getClass();
        KAT kat = new KAT(requireContext, r0.A0H, r2, this);
        LS7 A012 = LT8.A01(this.A03);
        0gy A002 = AnonymousClass07i.A00(fragment);
        Ki3 ki3 = Ki3.STORY_VIEWER_SUGGESTED_HIGHLIGHT;
        LS7.A01(A012);
        LNo.A00().A01(new C64498Lcz(requireContext, A002, A012, ki3, kat), kat);
    }

    public final void Djy(AnonymousClass3BQ r1) {
    }

    public final void DkE() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r1 = X.LT8.A01(r9.A03);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00() {
        /*
            r9 = this;
            X.4mU r2 = r9.A04
            r0 = r2
            instagram.features.stories.fragment.ReelViewerFragment r0 = (instagram.features.stories.fragment.ReelViewerFragment) r0
            X.3mM r0 = r0.A0a
            r0.getClass()
            com.instagram.model.reels.Reel r0 = r0.A0H
            boolean r0 = r0.A0p()
            if (r0 == 0) goto L_0x0072
            boolean r0 = r9.A00
            if (r0 != 0) goto L_0x0072
            com.instagram.common.session.UserSession r0 = r9.A03
            X.LS7 r1 = X.LT8.A01(r0)
            com.instagram.model.reels.Reel r6 = r1.A02
            if (r6 == 0) goto L_0x0072
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0072
            com.instagram.common.session.UserSession r5 = r1.A05
            java.util.List r8 = r1.A06
            java.lang.String r7 = r1.A03
            r7.getClass()
            X.L8l r3 = r1.A01
            X.L8l r4 = r1.A00
            boolean r0 = X.LS7.A02(r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L_0x0072
            java.lang.String r0 = "context_switch"
            r2.EHY(r0)
            androidx.fragment.app.Fragment r0 = r9.A05
            android.content.Context r0 = r0.getContext()
            X.8ab r2 = new X.8ab
            r2.<init>((android.content.Context) r0)
            r0 = 2131974696(0x7f135a28, float:1.9586463E38)
            r2.A09(r0)
            r0 = 2131974693(0x7f135a25, float:1.9586457E38)
            r2.A08(r0)
            r1 = 2131974694(0x7f135a26, float:1.958646E38)
            X.LU9 r0 = new X.LU9
            r0.<init>(r9)
            r2.A0H(r0, r1)
            r1 = 2131974695(0x7f135a27, float:1.9586461E38)
            X.LU8 r0 = new X.LU8
            r0.<init>(r9)
            r2.A0I(r0, r1)
            android.app.Dialog r0 = r2.A02()
            X.AnonymousClass0fN.A00(r0)
            r0 = 1
            return r0
        L_0x0072:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C314696ih.A00():boolean");
    }

    public final void DCA() {
        Bundle bundle = new Bundle();
        AnonymousClass87G r3 = new AnonymousClass87G(new AnonymousClass8YE((Drawable) null, AnonymousClass87I.END_OF_YEAR, (String) null));
        try {
            bundle.putString("create_mode_attribution", D0Y.A00(r3));
            bundle.putParcelable("camera_configuration", C358098aM.A00(AnonymousClass9QA.A00, C358088aL.A0C));
            bundle.putSerializable("camera_entry_point", 28D.A2Y);
            Fragment fragment = this.A05;
            AnonymousClass6W8 A022 = AnonymousClass6W8.A02(fragment.requireActivity(), bundle, this.A03, ModalActivity.class, "attribution_quick_camera_fragment");
            A022.A07();
            A022.A0C(fragment.requireActivity());
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to serialize dialElement of type ");
            AnonymousClass87I r0 = r3.A04;
            if (r0 == null) {
                r0 = AnonymousClass87I.EMPTY;
            }
            sb.append(r0);
            0wb.A06("serialize_create_mode_attribution", sb.toString(), e);
        }
    }

    public final void DUL() {
        Bundle bundle = new Bundle();
        AnonymousClass87G r3 = new AnonymousClass87G(new AnonymousClass8YE((Drawable) null, AnonymousClass87I.BIRTHDAY_HIGHLIGHTS, (String) null));
        try {
            bundle.putString("create_mode_attribution", D0Y.A00(r3));
            bundle.putParcelable("camera_configuration", C358098aM.A00(AnonymousClass9QA.A00, C358088aL.A0C));
            bundle.putSerializable("camera_entry_point", 28D.A0Z);
            Fragment fragment = this.A05;
            AnonymousClass6W8 A022 = AnonymousClass6W8.A02(fragment.requireActivity(), bundle, this.A03, ModalActivity.class, "attribution_quick_camera_fragment");
            A022.A07();
            A022.A0C(fragment.requireActivity());
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to serialize dialElement of type ");
            AnonymousClass87I r0 = r3.A04;
            if (r0 == null) {
                r0 = AnonymousClass87I.EMPTY;
            }
            sb.append(r0);
            0wb.A06("serialize_create_mode_attribution", sb.toString(), e);
        }
    }

    public final void Dda() {
        C250973mM r0 = ((ReelViewerFragment) this.A04).A0a;
        r0.getClass();
        Reel reel = r0.A0H;
        Fragment fragment = this.A05;
        Context requireContext = fragment.requireContext();
        UserSession userSession = this.A03;
        AnonymousClass0iw r6 = this.A02;
        new LG3(requireContext, fragment.getParentFragmentManager(), AnonymousClass07i.A00(fragment), r6, userSession).A01(new C64502Ld3(this), reel.getId());
    }

    public C314696ih(Fragment fragment, AnonymousClass0iw r2, UserSession userSession, C273384mU r4) {
        this.A04 = r4;
        this.A05 = fragment;
        this.A03 = userSession;
        this.A02 = r2;
    }
}
