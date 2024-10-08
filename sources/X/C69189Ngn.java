package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Ngn  reason: case insensitive filesystem */
public final class C69189Ngn extends AnonymousClass7AK {
    public final /* synthetic */ AnonymousClass7EI A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69189Ngn(AnonymousClass7EI r2) {
        super((Integer) null);
        this.A00 = r2;
    }

    public final void onClick(View view) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putInt("magic_media_remix_template_position", 0);
        A0a.putString("magic_media_remix_template_layout_name", "POLAROID_2X");
        A0a.putStringArrayList("magic_media_remix_template_bitmap_paths", AnonymousClass7TE.A1C());
        AnonymousClass7EI r0 = this.A00;
        Activity activity = r0.A01;
        C66581MXm.A16(activity, DbS.A0b(activity, A0a, r0.A02, ModalActivity.class, "MAGIC_MEDIA_REMIX_TEMPLATE"));
    }
}
