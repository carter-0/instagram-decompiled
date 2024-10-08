package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

/* renamed from: X.DmA  reason: case insensitive filesystem */
public final class C46834DmA extends 2Rw {
    public List A00 = 0sn.A00;

    public final void onBindViewHolder(C249703kE r8, int i) {
        int i2;
        int i3;
        0qQ.A0B(r8, 0);
        boolean z = ((JV5) this.A00.get(i)).A01;
        Object obj = ((JV5) this.A00.get(i)).A00;
        View view = r8.itemView;
        Context context = view.getContext();
        C46934Dno dno = (C46934Dno) r8;
        view.setEnabled(z);
        IgTextView igTextView = dno.A01;
        int intValue = ((Number) ((JV5) this.A00.get(i)).A03).intValue();
        switch (intValue) {
            case 1:
                i2 = 2131975482;
                break;
            case 2:
                i2 = 2131975481;
                break;
            case 3:
                i2 = 2131975480;
                break;
            case 4:
                i2 = 2131975479;
                break;
            case 5:
                i2 = 2131975483;
                break;
            case 6:
                i2 = 2131975477;
                break;
            default:
                i2 = 2131975476;
                break;
        }
        igTextView.setText(context.getText(i2));
        IgSimpleImageView igSimpleImageView = dno.A00;
        switch (intValue) {
            case 1:
                i3 = R.drawable.instagram_text_pano_outline_24;
                break;
            case 2:
                i3 = R.drawable.instagram_photo_pano_outline_24;
                break;
            case 3:
                i3 = R.drawable.instagram_effects_pano_outline_24;
                break;
            case 4:
                i3 = R.drawable.instagram_sliders_pano_outline_24;
                break;
            case 5:
                i3 = R.drawable.instagram_scissors_pano_outline_24;
                break;
            case 6:
                i3 = R.drawable.instagram_photo_gallery_pano_outline_24;
                break;
            default:
                i3 = R.drawable.instagram_music_add_pano_outline_24;
                break;
        }
        igSimpleImageView.setImageResource(i3);
        DbU.A14(context, igSimpleImageView, 2Yu.A0B(context));
        FP5.A01(r8.itemView, 67, obj);
        float f = 0.5f;
        if (z) {
            f = 1.0f;
        }
        igSimpleImageView.setAlpha(f);
        igTextView.setAlpha(f);
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        if (i == R.id.toolbar_action_audio) {
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new C46934Dno(DbT.A0D(DbV.A0D(viewGroup), viewGroup, R.layout.creation_bottom_toolbar_view_holder_item, false));
        } else if (i == R.id.toolbar_action_tool) {
            int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new C46934Dno(DbT.A0D(DbV.A0D(viewGroup), viewGroup, R.layout.creation_bottom_toolbar_view_holder_item, false));
        } else {
            throw AnonymousClass7TE.A0z("Unknown view type");
        }
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-1142548962);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(1244136046, A03);
        return size;
    }

    public final int getItemViewType(int i) {
        int A03 = AnonymousClass0fD.A03(-1673258124);
        int A0M = AnonymousClass7TE.A0M(((JV5) this.A00.get(i)).A03);
        int i2 = R.id.toolbar_action_tool;
        if (A0M == 0) {
            i2 = R.id.toolbar_action_audio;
        }
        AnonymousClass0fD.A0A(211876100, A03);
        return i2;
    }
}
