package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsListCell;

public final class E2R extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CaptionSettingFragment";
    public Context A00;
    public boolean A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        if (this.A01) {
            r2.Eom(2131973372);
        }
    }

    public final String getModuleName() {
        return "caption_settings_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Object value;
        Integer num;
        CharSequence charSequence;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C46744DkX dkX = (C46744DkX) this.A03.getValue();
        05G r4 = dkX.A01;
        do {
            value = r4.getValue();
            UserSession userSession = dkX.A00;
            if (AnonymousClass3WP.A07(userSession)) {
                num = AnonymousClass05K.A00;
            } else if (AnonymousClass3WS.A06(userSession)) {
                num = AnonymousClass05K.A01;
            } else {
                num = AnonymousClass05K.A0C;
            }
            0qQ.A0B(num, 0);
        } while (!r4.AIY(value, new C61080JwI(23, num)));
        IgdsListCell igdsListCell = (IgdsListCell) AnonymousClass7TF.A0G(view, R.id.clips_translations_always_show_captions_button);
        C69349Njo njo = C69349Njo.TYPE_RADIO;
        igdsListCell.setTextCellType(njo);
        IgdsListCell igdsListCell2 = (IgdsListCell) AnonymousClass7TF.A0G(view, R.id.clips_translations_show_translated_captions_button);
        igdsListCell2.setTextCellType(njo);
        IgdsListCell igdsListCell3 = (IgdsListCell) AnonymousClass7TF.A0G(view, R.id.clips_translations_never_show_captions_button);
        igdsListCell3.setTextCellType(njo);
        igdsListCell.A0D(new FQO(this, 4));
        igdsListCell2.A0D(new FQO(this, 5));
        igdsListCell3.A0D(new FQO(this, 6));
        C46679Dj8 dj8 = new C46679Dj8(this, 3);
        Context context = this.A00;
        if (context != null) {
            String A16 = AnonymousClass7TE.A16(context, 2131955970);
            TextView A0R = AnonymousClass7TG.A0R(view, R.id.clips_translations_show_translated_captions_description);
            DbT.A1H(A0R);
            boolean z = this.A01;
            Context context2 = this.A00;
            if (z) {
                if (context2 != null) {
                    charSequence = DbW.A0h(context2, A16, 2131955968);
                }
            } else if (context2 != null) {
                SpannableStringBuilder A0D = DbY.A0D(context2, A16, 2131955968);
                AnonymousClass7AV.A05(A0D, dj8, A16);
                charSequence = A0D;
            }
            DbZ.A14(A0R, charSequence);
            07U r5 = 07U.A05;
            AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
            AnonymousClass7TE.A1Z(new JTw((Object) viewLifecycleOwner, (Object) r5, (Object) igdsListCell, (Object) igdsListCell3, (Object) this, (Object) igdsListCell2, (AnonymousClass4D7) null, 11), AnonymousClass07a.A00(viewLifecycleOwner));
            return;
        }
        0qQ.A0F("context");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public E2R() {
        C20609Wvq wvq = new C20609Wvq(this, 17);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20609Wvq(new C20609Wvq(this, 14), 15));
        this.A03 = DbS.A0I(new C20609Wvq(A002, 16), wvq, new C41566AwY(47, (Object) null, A002), DbS.A0z(C46744DkX.class));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1552901272);
        E2R.super.onCreate(bundle);
        this.A00 = requireContext();
        this.A01 = requireArguments().getBoolean("is_in_app_settings");
        AnonymousClass0fD.A09(-1047148223, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(256438936);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.caption_setting_bottomsheet, false);
        AnonymousClass0fD.A09(1895311162, A022);
        return A0D;
    }
}
