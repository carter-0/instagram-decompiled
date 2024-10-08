package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public final class GUD {
    public final Context A00;

    public GUD(Context context) {
        0qQ.A0B(context, 1);
        this.A00 = context;
    }

    public static final View A00(ViewGroup viewGroup) {
        View A09 = DbU.A09(DbV.A0D(viewGroup), viewGroup, R.layout.row_feed_scheduled_content_publish_time, false);
        A09.setTag(new C53122Giu(A09));
        return A09;
    }

    public final void A01(C53122Giu giu, int i) {
        0qQ.A0B(giu, 0);
        long j = ((long) i) * 1000;
        TextView textView = giu.A01;
        Context context = this.A00;
        DbX.A13(context, textView, new SimpleDateFormat("EEE, LLL d, h:mm a z", Locale.US).format(new Date(j)), 2131956684);
        if (Calendar.getInstance().getTimeInMillis() > j) {
            DbT.A17(context, textView, 2Yu.A03(context));
            ImageView imageView = giu.A00;
            imageView.setImageResource(R.drawable.instagram_error_pano_filled_24);
            imageView.setColorFilter(context.getColor(2Yu.A03(context)));
        }
    }

    public final void A02(C53122Giu giu, 1Xj r3) {
        Integer Bpd;
        AnonymousClass7TG.A1N(giu, r3);
        DSX Aqj = r3.A0C.Aqj();
        if (Aqj != null && (Bpd = Aqj.Bpd()) != null) {
            A01(giu, Bpd.intValue());
        }
    }
}
