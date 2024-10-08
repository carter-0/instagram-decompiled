package X;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.3Cr  reason: invalid class name and case insensitive filesystem */
public final class C238643Cr extends ImageView {
    public C226952iF A00;
    public String A01;
    public final Queue A02 = new LinkedBlockingQueue();
    public final AnonymousClass1MK A03 = new C238653Cs(this);

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        if (isEnabled()) {
            super.onDraw(canvas);
            A00();
        }
    }

    public final void A00() {
        int i;
        ImageUrl imageUrl = (ImageUrl) this.A02.poll();
        if (imageUrl != null) {
            1OO A0J = 1NK.A00().A0J(imageUrl, this.A01);
            A0J.A0I = true;
            A0J.A0F = true;
            A0J.A02(this.A03);
            i = 0;
            A0J.A0M = false;
            A0J.A0E = false;
            C226952iF A002 = A0J.A00();
            this.A00 = A002;
            A002.E5t();
        } else {
            i = 4;
        }
        setVisibility(i);
    }

    public final void A01(ImageUrl imageUrl) {
        if (imageUrl != null) {
            Queue<ImageUrl> queue = this.A02;
            if (!(queue instanceof Collection) || !queue.isEmpty()) {
                for (ImageUrl url : queue) {
                    if (0qQ.A0K(url.getUrl(), imageUrl.getUrl())) {
                        return;
                    }
                }
            }
            if (queue.size() == 3) {
                queue.poll();
            }
            queue.add(imageUrl);
        }
    }

    public C238643Cr(Context context) {
        super(context);
    }

    public final void setSource(String str) {
        this.A01 = str;
    }
}
