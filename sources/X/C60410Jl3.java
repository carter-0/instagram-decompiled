package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.api.schemas.AudioMetadataLabels;
import com.instagram.api.schemas.TrackMetadata;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.music.common.model.MusicSearchPlaylist;
import java.util.List;

/* renamed from: X.Jl3  reason: case insensitive filesystem */
public final class C60410Jl3 extends 2Rw {
    public List A00 = 0sn.A00;
    public final /* synthetic */ KVJ A01;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C60672JpJ(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.music_playlist_spotlight_banner_item, false));
    }

    public final /* bridge */ /* synthetic */ void onViewAttachedToWindow(C249703kE r6) {
        0qQ.A0B(r6, 0);
        C66569MWx A002 = ((JZC) this.A00.get(r6.getAbsoluteAdapterPosition())).A00();
        if (A002 != null) {
            KVJ kvj = this.A01;
            MU5 mu5 = kvj.A07;
            int absoluteAdapterPosition = r6.getAbsoluteAdapterPosition();
            MusicSearchPlaylist musicSearchPlaylist = kvj.A02;
            if (musicSearchPlaylist == null) {
                0qQ.A0F("musicSearchPlaylist");
                throw AnonymousClass00P.createAndThrow();
            } else {
                mu5.DmA(kvj, A002, musicSearchPlaylist, absoluteAdapterPosition);
            }
        }
    }

    public C60410Jl3(KVJ kvj) {
        this.A01 = kvj;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r12, int i) {
        TrackMetadata trackMetadata;
        List Ay7;
        AudioMetadataLabels audioMetadataLabels;
        Resources resources;
        int i2;
        C60672JpJ jpJ = (C60672JpJ) r12;
        0qQ.A0B(jpJ, 0);
        IgTextView igTextView = jpJ.A03;
        igTextView.setVisibility(8);
        C66569MWx A002 = ((JZC) this.A00.get(i)).A00();
        if (A002 != null) {
            KVJ kvj = this.A01;
            JZC jzc = (JZC) this.A00.get(i);
            jpJ.A04.setText(A002.getTitle());
            IgTextView igTextView2 = jpJ.A02;
            igTextView2.setText(A002.getDisplayArtist());
            Context A06 = JTQ.A06(kvj);
            Resources A07 = JTS.A07(kvj);
            boolean z = kvj.A0B;
            int i3 = R.dimen.abc_text_size_menu_header_material;
            if (z) {
                i3 = R.dimen.add_payment_bottom_sheet_row_subtitle_size;
            }
            igTextView2.setTextSize(0nA.A02(A06, A07.getDimension(i3)));
            jpJ.A06.setUrl(A002.As3(), kvj);
            LY9.A00(jpJ.A00, A002, kvj, i, 8);
            if (A002.isExplicit()) {
                jpJ.A05.setVisibility(0);
            }
            if (!z && !(((trackMetadata = jzc.A0A) == null && (trackMetadata = jzc.A09) == null) || (Ay7 = trackMetadata.Ay7()) == null || (audioMetadataLabels = (AudioMetadataLabels) 00k.A0J(Ay7)) == null)) {
                int ordinal = audioMetadataLabels.ordinal();
                if (ordinal == 2) {
                    resources = igTextView.getResources();
                    i2 = 2131967872;
                } else if (ordinal == 1) {
                    resources = igTextView.getResources();
                    i2 = 2131967871;
                }
                String string = resources.getString(i2);
                if (string != null) {
                    igTextView.setVisibility(0);
                    igTextView.setText(string);
                }
            }
            jpJ.A01.setForeground(new ColorDrawable(JTQ.A06(kvj).getColor(R.color.black_40_transparent)));
            return;
        }
        throw AnonymousClass7TE.A0w("MusicSearchTrack cannot be null");
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(1727338598);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(2110847433, A03);
        return size;
    }
}
