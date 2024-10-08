package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.explore.topiccluster.ExploreTopicCluster;

/* renamed from: X.Ja1  reason: case insensitive filesystem */
public final class C59826Ja1 extends C249703kE {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59826Ja1(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = AnonymousClass7TE.A0b(view, R.id.interest_background);
        this.A02 = DbW.A0B(view, R.id.interest_text_view);
        this.A01 = (ImageView) AnonymousClass7TE.A0b(view, R.id.interest_icon);
    }

    public final void A00(WW4 ww4, C46558Dh0 dh0, int i, boolean z) {
        String str;
        String str2;
        Integer num = dh0.A01;
        Integer num2 = AnonymousClass05K.A0C;
        if (num == num2) {
            str = AnonymousClass7TF.A0d(this.A02.getResources(), 2131968373);
        } else {
            str = dh0.A03;
        }
        ExploreTopicCluster exploreTopicCluster = dh0.A00;
        if (exploreTopicCluster != null) {
            str2 = exploreTopicCluster.A06;
        } else {
            str2 = "";
        }
        int intValue = num.intValue();
        if (intValue == 4 || intValue == 0) {
            num2 = AnonymousClass05K.A00;
        } else if (intValue == 3 || intValue == 1) {
            num2 = AnonymousClass05K.A01;
        } else if (intValue != 2) {
            throw AnonymousClass7TE.A1K();
        }
        ww4.A0N(num2, str, str2, i, z);
    }
}
