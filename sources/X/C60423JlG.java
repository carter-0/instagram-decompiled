package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.JlG  reason: case insensitive filesystem */
public final class C60423JlG extends 2Rw {
    public L65 A00;
    public final int A01;
    public final Context A02;

    public C60423JlG(Context context, int i) {
        0qQ.A0B(context, 1);
        this.A02 = context;
        this.A01 = i;
    }

    public final void onBindViewHolder(C249703kE r8, int i) {
        Bitmap Ayu;
        0qQ.A0B(r8, 0);
        L65 l65 = this.A00;
        if (l65 == null) {
            0qQ.A0F("renderItemProvider");
            throw AnonymousClass00P.createAndThrow();
        }
        List list = l65.A02;
        C60477Jm9 jm9 = l65.A01;
        C60586Jnv jnv = (C60586Jnv) r8;
        View A0F = JTO.A0F(jnv);
        ViewGroup.LayoutParams layoutParams = A0F.getLayoutParams();
        if (layoutParams != null) {
            int i2 = jnv.A01;
            layoutParams.width = i2;
            int i3 = jnv.A00;
            layoutParams.height = i3;
            A0F.setLayoutParams(layoutParams);
            jnv.itemView.setBackground((Drawable) null);
            C66539MVt mVt = (C66539MVt) list.get(i);
            if (182.A06(0Tu.A05, jm9.A0F, 36315473202711793L)) {
                mVt.Afv(jnv, i2, i3);
                return;
            }
            String Bjh = mVt.Bjh();
            if (Bjh != null) {
                Ayu = BitmapFactory.decodeFile(Bjh);
            } else {
                Ayu = mVt.Ayu(i2, i3);
            }
            View view = jnv.itemView;
            view.setBackground(new BitmapDrawable(view.getResources(), Ayu));
            return;
        }
        throw AnonymousClass7TE.A11(AnonymousClass000.A00(49));
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C60586Jnv(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.reorder_cover_frame_item, false), A01(), A00());
    }

    public final int A00() {
        Integer num;
        Resources resources;
        int i;
        int i2 = this.A01;
        if (i2 == 1) {
            num = AnonymousClass05K.A01;
        } else if (i2 != 2) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A0C;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            resources = this.A02.getResources();
            if (intValue != 1) {
                i = R.dimen.asset_picker_video_sticker_width;
            } else {
                i = R.dimen.ai_agent_embodiment_video_container_size;
            }
        } else {
            resources = this.A02.getResources();
            i = R.dimen.avatar_sticker_max_height;
        }
        return resources.getDimensionPixelSize(i);
    }

    public final int A01() {
        Integer num;
        Resources resources;
        int i;
        int i2 = this.A01;
        if (i2 == 1) {
            num = AnonymousClass05K.A01;
        } else if (i2 != 2) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A0C;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            resources = this.A02.getResources();
            if (intValue != 1) {
                i = R.dimen.ai_agent_embodiment_video_container_size;
            } else {
                i = R.dimen.ab_test_media_thumbnail_preview_item_width;
            }
        } else {
            resources = this.A02.getResources();
            i = R.dimen.ad_not_delivering_thumbnail_height;
        }
        return resources.getDimensionPixelSize(i);
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(1855891915);
        L65 l65 = this.A00;
        if (l65 == null) {
            0qQ.A0F("renderItemProvider");
            throw AnonymousClass00P.createAndThrow();
        }
        int i = l65.A00;
        AnonymousClass0fD.A0A(-280756255, A03);
        return i;
    }
}
