package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;

/* renamed from: X.Ngo  reason: case insensitive filesystem */
public final class C69190Ngo extends AnonymousClass7AK {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C70799OLu A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69190Ngo(FragmentActivity fragmentActivity, C70799OLu oLu, String str, int i) {
        super(Integer.valueOf(i));
        this.A01 = oLu;
        this.A00 = fragmentActivity;
        this.A02 = str;
    }

    public final void onClick(View view) {
        C70799OLu oLu = this.A01;
        C71110Ocp.A01(this.A00, (GPK) null, oLu.A07, (ContentNoteMetadata) null, oLu.A09, this.A02, false);
    }
}
