package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.71U  reason: invalid class name */
public final class AnonymousClass71U extends C231632rz {
    public final Context A00;

    public final int getViewTypeCount() {
        return AnonymousClass05K.A00(2).length;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        if (r2 != null) {
            r2.A7U(0);
        }
    }

    public AnonymousClass71U(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(1745018226);
        0qQ.A0B(view, 1);
        0qQ.A0B(obj, 2);
        int intValue = AnonymousClass05K.A00(2)[i].intValue();
        if (intValue == 0) {
            VNH vnh = (VNH) obj;
            0qQ.A0B(vnh, 1);
            Object tag = view.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.feed.ui.rows.notice.FeedTopNoticeRowViewBinder.Holder");
            VSC vsc = (VSC) tag;
            CharSequence charSequence = vnh.A00;
            TextView textView = vsc.A01;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            vsc.A00.setVisibility(8);
            AnonymousClass0fD.A0A(141399398, A03);
        } else if (intValue == 1) {
            0qQ.A0C(view.getTag(), "null cannot be cast to non-null type com.instagram.feed.ui.rows.notice.FeedTopNoticeRowWithThumbnailViewBinder.Holder");
            throw new NullPointerException("titleText");
        } else {
            RuntimeException runtimeException = new RuntimeException();
            AnonymousClass0fD.A0A(652973143, A03);
            throw runtimeException;
        }
    }

    public final View createView(int i, ViewGroup viewGroup) {
        View inflate;
        Object vsc;
        int A03 = AnonymousClass0fD.A03(1091544462);
        0qQ.A0B(viewGroup, 1);
        int intValue = AnonymousClass05K.A00(2)[i].intValue();
        if (intValue == 0) {
            Context context = this.A00;
            0qQ.A0B(context, 0);
            inflate = LayoutInflater.from(context).inflate(R.layout.row_feed_notice, viewGroup, false);
            0qQ.A0A(inflate);
            vsc = new VSC(inflate);
        } else if (intValue == 1) {
            Context context2 = this.A00;
            0qQ.A0B(context2, 0);
            inflate = LayoutInflater.from(context2).inflate(R.layout.row_feed_notice_with_thumbnail, viewGroup, false);
            0qQ.A0A(inflate);
            vsc = new OGI(inflate);
        } else {
            RuntimeException runtimeException = new RuntimeException();
            AnonymousClass0fD.A0A(968097609, A03);
            throw runtimeException;
        }
        inflate.setTag(vsc);
        AnonymousClass0fD.A0A(1766389224, A03);
        return inflate;
    }
}
