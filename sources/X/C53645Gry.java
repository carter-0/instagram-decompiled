package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gry  reason: case insensitive filesystem */
public final class C53645Gry extends C251343mx {
    public final C61080JwI A00;
    public final AnonymousClass0iw A01;

    public final C251263mp A0X(AnonymousClass3Y5 r19) {
        float f;
        float f2;
        AnonymousClass3Y5 r2 = r19;
        0qQ.A0B(r2, 0);
        List list = (List) this.A00.A00;
        ArrayList A0p = AnonymousClass7TF.A0p(list);
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    break;
                }
                float f3 = 48.0f / ((float) (i + 2));
                Context A0B = C51965G9l.A0B(r2.Aqq());
                A0p.add(new C244303ay((ImageUrl) next, 002.A0R(this.A01.getModuleName(), "NotesOverflowAvatarsComponent"), (int) C61380mr.A00(A0B, f3), 0, A0B.getColor(R.color.fds_transparent), A0B.getColor(R.color.fds_transparent)));
                i = i2;
            } else {
                AnonymousClass3XV r0 = 2WX.A02;
                long A0C = C51970G9q.A0C();
                2WX A0M = C51974G9v.A0M((2WX) null, AnonymousClass05K.A00, 0, A0C);
                2Wb A0Q = C51972G9s.A0Q(r2);
                A0Q.A00(new C53889Gvu(A0C, A0C, true));
                ArrayList A0p2 = AnonymousClass7TF.A0p(A0p);
                int i3 = 0;
                for (Object next2 : A0p) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        Drawable drawable = (Drawable) next2;
                        2WX A0B2 = C51974G9v.A0B((2WX) null);
                        int size = A0p.size();
                        if (i3 == 0) {
                            f = 18.0f;
                        } else if (i3 == 1) {
                            f = 6.0f;
                            if (size <= 2) {
                                f = 8.0f;
                            }
                        } else {
                            f = 26.0f;
                        }
                        long A06 = C51965G9l.A06(f);
                        int size2 = A0p.size();
                        if (i3 == 0) {
                            f2 = 4.0f;
                        } else if (i3 == 1) {
                            f2 = 24.0f;
                            if (size2 <= 2) {
                                f2 = 28.0f;
                            }
                        } else {
                            f2 = 32.0f;
                        }
                        C51969G9p.A13(drawable, (ImageView.ScaleType) null, A0Q, AnonymousClass9JR.A00(AnonymousClass9JR.A00(A0B2, AnonymousClass05K.A0C, 1, A06), AnonymousClass05K.A0N, 1, C51965G9l.A06(f2)));
                        A0p2.add(C60340gF.A00);
                        i3 = i4;
                    }
                }
                return C243563Zg.A0B(A0Q, r2, A0M);
            }
        }
        0sr.A1T();
        throw AnonymousClass00P.createAndThrow();
    }

    public C53645Gry(C61080JwI jwI, AnonymousClass0iw r2) {
        AnonymousClass7TG.A1O(r2, jwI);
        this.A01 = r2;
        this.A00 = jwI;
    }
}
