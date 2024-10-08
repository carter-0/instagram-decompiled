package X;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

public final class K3N extends C61364K4g {
    public static final String __redex_internal_original_name = "AvatarMusicStickerGridFragment";
    public C317866ny A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public String A04;
    public final AnonymousClass0eM A05 = DbS.A0I(MMS.A00(this, 9), MMS.A00(this, 7), MMW.A00((Object) null, this, 38), DbS.A0z(C60153JgY.class));
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.avatar_sticker_grid_container);
        if (findViewById != null) {
            DbT.A16(requireContext(), findViewById, R.color.grey_10);
        }
        TextView A0d = AnonymousClass7TE.A0d(view, R.id.avatar_sticker_grid_empty_text_view);
        if (A0d != null) {
            DbT.A17(requireContext(), A0d, R.color.grey_4);
        }
        TextView A0d2 = AnonymousClass7TE.A0d(view, R.id.avatar_sticker_grid_editor_button);
        if (A0d2 != null) {
            DbT.A17(requireContext(), A0d2, R.color.grey_4);
        }
        ImageView A0G = DbS.A0G(view, R.id.avatar_sticker_grid_back_button);
        if (A0G != null) {
            DbU.A14(requireContext(), A0G, R.color.grey_4);
        }
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) view.findViewById(R.id.avatar_sticker_grid_search_box);
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.setTextColor(requireContext().getColor(R.color.grey_0));
            igdsInlineSearchBox.setClearButtonColor(JTQ.A03(this, R.color.grey_0));
            igdsInlineSearchBox.setSearchGlyphColor(JTQ.A03(this, R.color.grey_0));
        }
    }

    public final String getModuleName() {
        String str = this.A04;
        if (str != null) {
            return 002.A0R(str, "_avatar_sticker_grid");
        }
        0qQ.A0F("previousModuleName");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public K3N() {
        MMS A002 = MMS.A00(this, 8);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, MMS.A00(MMS.A00(this, 10), 11));
        this.A06 = DbS.A0I(MMS.A00(A003, 12), A002, MMW.A00((Object) null, A003, 39), DbS.A0z(C314326i1.class));
        this.A03 = true;
        this.A02 = true;
        this.A00 = C317866ny.MUSIC;
        this.A01 = "ig_music_search";
        this.A07 = C227642jf.A02(this);
    }

    public final void onCreate(Bundle bundle) {
        String string;
        int A022 = AnonymousClass0fD.A02(-1751662395);
        K3N.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (string = bundle2.getString("args_previous_module_name")) == null) {
            IllegalStateException A0z = AnonymousClass7TE.A0z("previous module required");
            AnonymousClass0fD.A09(-1412285141, A022);
            throw A0z;
        }
        this.A04 = string;
        int i = 3;
        if (182.A06(0Tu.A05, DbT.A0X(this.A07), 36319471815695785L)) {
            i = 4;
        }
        this.A00 = i;
        AnonymousClass0fD.A09(-1133944565, A022);
    }
}
