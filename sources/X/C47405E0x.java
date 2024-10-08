package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.user.model.User;

/* renamed from: X.E0x  reason: case insensitive filesystem */
public final class C47405E0x extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "SwitchProfileEducationFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01 = DbS.A0I(new C73903Ple(this, 48), new C73903Ple(this, 49), new C73667Phg(39, (Object) null, this), DbS.A0z(C67708MtN.class));

    public final String getModuleName() {
        return "smart_glasses_sharing";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        int i;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        User A0l = DbX.A0l(AnonymousClass0t1.A01, this.A00);
        String username = A0l.getUsername();
        ImageUrl Bh3 = A0l.Bh3();
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TF.A0G(view, R.id.headline);
        String str2 = null;
        String str3 = null;
        IgdsHeadline.A01(igdsHeadline, (Integer) null).setUrl(Bh3, igdsHeadline);
        Context context = getContext();
        boolean z = false;
        if (context != null) {
            str = DbW.A0h(context, username, 2131974864);
        } else {
            str = null;
        }
        igdsHeadline.setHeadline((CharSequence) str);
        View requireViewById = view.requireViewById(R.id.cancel_provider_linking);
        requireViewById.setEnabled(true);
        FP8.A01(requireViewById, 50, this);
        View requireViewById2 = view.requireViewById(R.id.next_button);
        requireViewById2.setEnabled(true);
        FP8.A01(requireViewById2, 51, this);
        if (A0l.A0N() == AnonymousClass05K.A01) {
            z = true;
        }
        IgdsBulletCell igdsBulletCell = (IgdsBulletCell) view.requireViewById(R.id.story_audience_cell);
        Context context2 = igdsBulletCell.getContext();
        if (z) {
            if (context2 != null) {
                str2 = context2.getString(2131974355);
                i = 2131974354;
            }
            IgdsBulletCell.A00(igdsBulletCell, str2, str3);
        }
        if (context2 != null) {
            str2 = context2.getString(2131974353);
            i = 2131974352;
        }
        IgdsBulletCell.A00(igdsBulletCell, str2, str3);
        str3 = context2.getString(i);
        IgdsBulletCell.A00(igdsBulletCell, str2, str3);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1343700185);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.profile_switching_education_fragment, false);
        AnonymousClass0fD.A09(725339562, A02);
        return A0D;
    }
}
