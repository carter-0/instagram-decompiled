package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;

/* renamed from: X.Hvd  reason: case insensitive filesystem */
public final class C56269Hvd {
    public static final void A00(C59832Ja7 ja7, LBJ lbj) {
        AnonymousClass7TF.A1H(lbj, ja7);
        View view = lbj.A01;
        view.setVisibility(0);
        IgTextView igTextView = lbj.A07;
        Context context = lbj.A00;
        DbT.A18(context, igTextView, 2131973076);
        IgSimpleImageView igSimpleImageView = lbj.A04;
        igSimpleImageView.setVisibility(0);
        String str = ja7.A03;
        boolean A0W = 00l.A0W(str);
        IgTextView igTextView2 = lbj.A06;
        if (A0W) {
            igTextView2.setVisibility(8);
            if (lbj.A02 == C62666KkS.BIO_IG_REELS_EDIT) {
                lbj.A05.setVisibility(8);
            }
        } else {
            igTextView2.setVisibility(0);
            igTextView2.setText(str);
            DbT.A18(context, igTextView, 2131961473);
            if (lbj.A02 == C62666KkS.BIO_IG_REELS_EDIT) {
                igSimpleImageView.setVisibility(8);
                IgSimpleImageView igSimpleImageView2 = lbj.A05;
                igSimpleImageView2.setVisibility(0);
                C56800ICx.A00(igSimpleImageView2, 26, ja7);
            }
            C250873mC r10 = C250863mB.A03;
            String str2 = ja7.A05;
            if (str2 == null) {
                str2 = "{}";
            }
            AnonymousClass40R r11 = r10.A02;
            0Ye A00 = 0tm.A00(String.class);
            Integer num = AnonymousClass05K.A00;
            Map map = (Map) r10.A00(str2, C360038dt.A02(0tm.A02(new 0Dj(num, A00), new 0Dj(num, 0tm.A00(JsonElement.class))), r11));
            String A002 = AnonymousClass000.A00(1374);
            if (map.containsKey(A002)) {
                igTextView.setText(str);
                String valueOf = String.valueOf(map.get(A002));
                0qQ.A0B(valueOf, 0);
                igTextView2.setText(00l.A0E("\"", "\"", valueOf));
            }
        }
        AnonymousClass0fU.A00(new LYG(24, ja7, lbj), view);
    }
}
