package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.Wnm  reason: case insensitive filesystem */
public final class C20247Wnm implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UES A01;

    public C20247Wnm(UES ues, int i) {
        this.A01 = ues;
        this.A00 = i;
    }

    public final void run() {
        UES ues = this.A01;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View view = ues.A00;
        AnonymousClass479 r5 = new AnonymousClass479(view);
        ViewGroup viewGroup = ues.A04;
        int i2 = this.A00;
        Rect rect = new Rect();
        viewGroup.getHitRect(rect);
        int i3 = -i2;
        rect.inset(i3, i3);
        TouchDelegate touchDelegate = new TouchDelegate(rect, viewGroup);
        List list = r5.A00;
        list.add(touchDelegate);
        TextView textView = ues.A07;
        Rect rect2 = new Rect();
        textView.getHitRect(rect2);
        rect2.inset(i3, i3);
        list.add(new TouchDelegate(rect2, textView));
        TextView textView2 = ues.A0A;
        Rect rect3 = new Rect();
        textView2.getHitRect(rect3);
        rect3.inset(i3, i3);
        list.add(new TouchDelegate(rect3, textView2));
        view.setTouchDelegate(r5);
        View view2 = ues.itemView;
        ImageView imageView = ues.A05;
        Rect rect4 = new Rect();
        imageView.getHitRect(rect4);
        rect4.inset(i3, i3);
        C66581MXm.A18(rect4, imageView, view2);
    }
}
