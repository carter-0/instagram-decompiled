package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Jkp  reason: case insensitive filesystem */
public final class C60396Jkp extends 2Rw {
    public final MUI A00;
    public final List A01 = AnonymousClass7TE.A1C();
    public final boolean A02;

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r7, int i) {
        String str;
        User user;
        C60636Joj joj = (C60636Joj) r7;
        0qQ.A0B(joj, 0);
        joj.A01.setVisibility(8);
        MediaSuggestedProductTag mediaSuggestedProductTag = (MediaSuggestedProductTag) 00k.A0O(this.A01, i);
        if (mediaSuggestedProductTag != null) {
            TextView textView = joj.A02;
            Product A07 = mediaSuggestedProductTag.A07();
            String str2 = null;
            if (A07 == null || (str = A07.A0J) == null) {
                str = "";
            }
            if (this.A02) {
                Product A072 = mediaSuggestedProductTag.A07();
                if (!(A072 == null || (user = A072.A0B) == null)) {
                    str2 = user.getUsername();
                }
                str = 002.A0j(str, "·", str2, ' ', ' ');
            }
            textView.setText(str);
            LY9.A00(joj.A00, mediaSuggestedProductTag, this, i, 11);
        }
    }

    public C60396Jkp(MUI mui, boolean z) {
        this.A00 = mui;
        this.A02 = z;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(1007148120);
        int size = this.A01.size();
        AnonymousClass0fD.A0A(833714661, A03);
        return size;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        DbS.A1W(viewGroup);
        return new C60636Joj(C64005LIl.A00(viewGroup));
    }
}
