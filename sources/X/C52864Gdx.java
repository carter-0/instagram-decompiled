package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.AudioFilterInfoIntf;
import com.instagram.api.schemas.OriginalAudioPartMetadataIntf;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* renamed from: X.Gdx  reason: case insensitive filesystem */
public final class C52864Gdx extends BaseAdapter {
    public final C56157Htl A00;
    public final List A01;
    public final LayoutInflater A02;
    public final AnonymousClass0iw A03;

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getCount() {
        return this.A01.size();
    }

    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A01.get(i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        AudioFilterInfoIntf audioFilterInfoIntf;
        int i2 = 0;
        View A0D = DbT.A0D(this.A02, viewGroup, R.layout.layout_clips_mix_sheet_item, false);
        OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf = (OriginalAudioPartMetadataIntf) this.A01.get(i);
        IgImageView A0b = DbT.A0b(A0D, R.id.music_album_art);
        ImageUrl C72 = originalAudioPartMetadataIntf.C72();
        if (C72 != null) {
            A0b.setUrl(C72, this.A03);
        }
        TextView A0G = DbU.A0G(A0D, R.id.primary_text);
        A0G.setText(originalAudioPartMetadataIntf.getDisplayTitle());
        if (originalAudioPartMetadataIntf.isExplicit()) {
            Drawable A002 = this.A00.A00();
            A0G.setCompoundDrawablePadding(AnonymousClass7TE.A0C(DbU.A05(A0G)));
            A0G.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, A002, (Drawable) null);
        }
        TextView A0G2 = DbU.A0G(A0D, R.id.filter_pill);
        List Adc = originalAudioPartMetadataIntf.Adc();
        if (Adc == null || (audioFilterInfoIntf = (AudioFilterInfoIntf) 00k.A0J(Adc)) == null) {
            i2 = 8;
        } else {
            DbU.A1A(DbU.A05(A0G2), A0G2, C263304Kd.A00(audioFilterInfoIntf.B5w()));
        }
        A0G2.setVisibility(i2);
        DbU.A0G(A0D, R.id.secondary_text).setText(originalAudioPartMetadataIntf.getDisplayArtist());
        AnonymousClass0fU.A00(new C56760IBj(i, 3, originalAudioPartMetadataIntf, this), A0D.requireViewById(R.id.track_container));
        A0D.setContentDescription(originalAudioPartMetadataIntf.getDisplayTitle());
        2eS.A01(A0D);
        A0D.addOnAttachStateChangeListener(new I9w(this, i));
        return A0D;
    }

    public C52864Gdx(Context context, AnonymousClass0iw r4, C56157Htl htl, List list) {
        this.A01 = list;
        this.A03 = r4;
        this.A00 = htl;
        Object systemService = context.getSystemService(AnonymousClass000.A00(318));
        0qQ.A0C(systemService, Pxd.A00(247));
        this.A02 = (LayoutInflater) systemService;
    }
}
