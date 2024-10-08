package X;

import android.graphics.Rect;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.6mD  reason: invalid class name and case insensitive filesystem */
public final class C316786mD implements 1wn {
    public final /* synthetic */ C316766mB A00;

    public C316786mD(C316766mB r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(913210520);
        C317326n5 r8 = (C317326n5) obj;
        int A032 = AnonymousClass0fD.A03(-997949829);
        0qQ.A0B(r8, 0);
        C243363Yl r1 = r8.A00;
        C243363Yl r0 = C243363Yl.LIKED;
        C316766mB r5 = this.A00;
        if (r1 == r0) {
            r5.A0B = true;
            Rect rect = new Rect();
            r5.A0L.getGlobalVisibleRect(rect);
            int i = (rect.left + rect.right) / 2;
            r5.A02 = i;
            IgSimpleImageView igSimpleImageView = r5.A06;
            if (igSimpleImageView != null) {
                igSimpleImageView.setTranslationX((float) (i - (((Number) r5.A0Q.getValue()).intValue() / 2)));
                IgSimpleImageView igSimpleImageView2 = r5.A06;
                if (igSimpleImageView2 != null) {
                    igSimpleImageView2.setVisibility(0);
                    r5.A0E.start();
                    r5.A0F.start();
                }
            }
            0qQ.A0F("heartView");
            throw AnonymousClass00P.createAndThrow();
        }
        r5.A0B = false;
        IgSimpleImageView igSimpleImageView3 = r5.A06;
        if (igSimpleImageView3 != null) {
            igSimpleImageView3.setVisibility(8);
            r5.A0E.end();
            r5.A0F.end();
        }
        0qQ.A0F("heartView");
        throw AnonymousClass00P.createAndThrow();
        AnonymousClass0fD.A0A(-707292730, A032);
        AnonymousClass0fD.A0A(-1389395610, A03);
    }
}
