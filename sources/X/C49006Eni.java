package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Eni  reason: case insensitive filesystem */
public abstract class C49006Eni {
    public static final View A00(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.spinner_dropdown_numeric_row, viewGroup, false);
        0qQ.A0A(context);
        TextView textView = (TextView) AnonymousClass7TF.A0G(inflate, R.id.row_user_textview);
        TextView textView2 = (TextView) AnonymousClass7TF.A0G(inflate, R.id.row_user_categorized_notification_textview);
        inflate.setTag(new C49660F0r(context, inflate, (ImageView) AnonymousClass7TF.A0G(inflate, R.id.check), textView, textView2, (TextView) AnonymousClass7TF.A0G(inflate, R.id.notification_count_avatar), (CircularImageView) AnonymousClass7TF.A0G(inflate, R.id.row_user_imageview), (IgdsButton) AnonymousClass7TF.A0G(inflate, R.id.login_button)));
        return inflate;
    }
}
