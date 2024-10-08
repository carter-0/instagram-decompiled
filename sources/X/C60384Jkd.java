package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.pendingmedia.model.BrandedContentTag;
import java.util.List;

/* renamed from: X.Jkd  reason: case insensitive filesystem */
public final class C60384Jkd extends 2Rw {
    public final List A00 = AnonymousClass7TE.A1C();
    public final 0sP A01;

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r6, int i) {
        String str;
        C60636Joj joj = (C60636Joj) r6;
        0qQ.A0B(joj, 0);
        LMD lmd = (LMD) this.A00.get(i);
        TextView textView = joj.A02;
        C60996Jus jus = lmd.A00;
        if (jus == null || (str = 002.A0g(jus.A06, " • ", jus.A02)) == null) {
            BrandedContentTag brandedContentTag = lmd.A01;
            if (brandedContentTag != null) {
                str = brandedContentTag.A02;
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        textView.setText(str);
        LY8.A00(joj.A00, 22, lmd, this);
    }

    public C60384Jkd(0sP r2) {
        this.A01 = r2;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(1626188152);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(-1686251368, A03);
        return size;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return C64005LIl.A01(viewGroup);
    }
}
