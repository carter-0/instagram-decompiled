package X;

import android.widget.Filter;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;

/* renamed from: X.7ea  reason: invalid class name and case insensitive filesystem */
public final class C336417ea extends Filter {
    public final /* synthetic */ C336207eF A00;

    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
    }

    public C336417ea(C336207eF r1) {
        this.A00 = r1;
    }

    public final CharSequence convertResultToString(Object obj) {
        StringBuilder sb;
        String username;
        if (obj instanceof Hashtag) {
            sb = new StringBuilder();
            sb.append("#");
            username = ((Hashtag) obj).getName();
        } else if (!(obj instanceof User)) {
            return "";
        } else {
            sb = new StringBuilder();
            sb.append("@");
            username = ((User) obj).getUsername();
        }
        sb.append(username);
        return sb.toString();
    }

    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        11Z.A02(new C41085Ao7(this, charSequence));
        return null;
    }
}
