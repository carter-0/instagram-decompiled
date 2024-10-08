package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.api.schemas.AudioFilterInfoIntf;
import com.instagram.api.schemas.OriginalAudioPartMetadataIntf;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

/* renamed from: X.Gi7  reason: case insensitive filesystem */
public final class C53074Gi7 extends 2Rw {
    public final OriginalAudioSubtype A00;
    public final C56157Htl A01;
    public final List A02;

    public C53074Gi7(OriginalAudioSubtype originalAudioSubtype, C56157Htl htl, List list) {
        0qQ.A0B(htl, 2);
        this.A02 = list;
        this.A01 = htl;
        this.A00 = originalAudioSubtype;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C53131Gj3(DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.layout_audio_page_mix_track_item_view, false));
    }

    public final /* bridge */ /* synthetic */ void onViewAttachedToWindow(C249703kE r5) {
        0qQ.A0B(r5, 0);
        int position = r5.getPosition();
        if (this.A02.size() <= 3 || position != 3) {
            this.A01.A04(this.A00, r5.getPosition(), false);
        }
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r7, int i) {
        Drawable drawable;
        IgTextView igTextView;
        int i2;
        View view;
        View.OnClickListener iBj;
        AudioFilterInfoIntf audioFilterInfoIntf;
        C53131Gj3 gj3 = (C53131Gj3) r7;
        0qQ.A0B(gj3, 0);
        List list = this.A02;
        if (list.size() <= 3 || i != 3) {
            OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf = (OriginalAudioPartMetadataIntf) list.get(i);
            IgTextView igTextView2 = gj3.A02;
            C56157Htl htl = this.A01;
            0qQ.A0B(originalAudioPartMetadataIntf, 0);
            SpannableStringBuilder A0E = C51965G9l.A0E();
            A0E.append(originalAudioPartMetadataIntf.getDisplayArtist());
            A0E.append(" • ");
            A0E.append(originalAudioPartMetadataIntf.getDisplayTitle());
            igTextView2.setText(DbT.A10(A0E));
            igTextView2.setCompoundDrawablePadding(AnonymousClass7TE.A0C(DbU.A05(igTextView2)));
            if (originalAudioPartMetadataIntf.isExplicit()) {
                drawable = htl.A00();
            } else {
                drawable = null;
            }
            igTextView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            List Adc = originalAudioPartMetadataIntf.Adc();
            if (Adc == null || (audioFilterInfoIntf = (AudioFilterInfoIntf) 00k.A0J(Adc)) == null) {
                igTextView = gj3.A01;
                i2 = 8;
            } else {
                igTextView = gj3.A01;
                DbU.A1A(DbU.A05(igTextView), igTextView, C263304Kd.A00(audioFilterInfoIntf.B5w()));
                i2 = 0;
            }
            igTextView.setVisibility(i2);
            view = gj3.A00;
            iBj = new C56760IBj(i, 2, originalAudioPartMetadataIntf, this);
        } else {
            IgTextView igTextView3 = gj3.A02;
            C56157Htl htl2 = this.A01;
            int size = list.size();
            SpannableStringBuilder A0E2 = C51965G9l.A0E();
            A0E2.append(htl2.A00.getResources().getString(2131953292));
            A0E2.append(" • ");
            A0E2.append(String.valueOf(size));
            igTextView3.setText(DbT.A10(A0E2));
            igTextView3.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            gj3.A01.setVisibility(8);
            view = gj3.A00;
            iBj = C56801ICy.A00(this, 4);
        }
        AnonymousClass0fU.A00(iBj, view);
    }

    public final int getItemCount() {
        int size;
        int A03 = AnonymousClass0fD.A03(-902101334);
        List list = this.A02;
        if (list.size() > 3) {
            size = 4;
        } else {
            size = list.size();
        }
        AnonymousClass0fD.A0A(1845584617, A03);
        return size;
    }
}
