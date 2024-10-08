package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.MediaType;
import com.instagram.api.schemas.ThreadHeaderStyle;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.user.model.User;

public final class J8Y extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (this.A00) {
            case 0:
                C286575Wy A0R = C51966G9m.A0R(obj, obj2);
                String str = this.A05;
                C54837HUt.A00(A0R, (Modifier) this.A04, (ThreadHeaderStyle) this.A03, str, C51966G9m.A01(this.A01), this.A02);
                break;
            case 1:
                C56236Hv3.A01(C51966G9m.A0R(obj, obj2), (Modifier) this.A03, this.A05, (C62320sa) this.A04, C51966G9m.A01(this.A01), this.A02);
                break;
            case 2:
                C54870HWd.A00(C51966G9m.A0R(obj, obj2), (MediaType) this.A03, this.A05, (C62320sa) this.A04, this.A02, C51966G9m.A01(this.A01));
                break;
            case 3:
                int i = this.A02;
                GQY.A08(C51966G9m.A0R(obj, obj2), (Modifier) this.A03, this.A05, (0sP) this.A04, i, C51966G9m.A01(this.A01));
                break;
            case 4:
                C56656I6l.A05(C51966G9m.A0R(obj, obj2), (User) this.A03, this.A05, (C62320sa) this.A04, C51966G9m.A01(this.A01), this.A02);
                break;
            default:
                View view = (View) obj4;
                MotionEvent motionEvent = (MotionEvent) obj3;
                AnonymousClass7TF.A1H(view, motionEvent);
                return Boolean.valueOf(((C21003X9a) this.A03).DZk(motionEvent, view, (ProductFeedItem) this.A04, this.A05, this.A02, this.A01, false));
        }
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J8Y(Object obj, Object obj2, String str, int i, int i2, int i3) {
        super(2);
        this.A00 = i3;
        this.A03 = obj;
        this.A04 = obj2;
        this.A02 = i;
        this.A01 = i2;
        this.A05 = str;
    }
}
