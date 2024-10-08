package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: X.KFn  reason: case insensitive filesystem */
public final class C61637KFn extends C232222tE {
    public final AnonymousClass0iw A00;
    public final C63682L2s A01;
    public final 0sP A02;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r11, C249703kE r12) {
        String str;
        ImageInfo BGO;
        ExtendedImageUrl A03;
        C64769Lhl lhl = (C64769Lhl) r11;
        C60667JpE jpE = (C60667JpE) r12;
        AnonymousClass7TG.A1N(lhl, jpE);
        if (lhl instanceof C232262tL) {
            SimpleDateFormat simpleDateFormat = C63552Kz1.A00;
            int A0M = AnonymousClass7TE.A0M(this.A02.invoke(lhl));
            C63682L2s l2s = this.A01;
            AnonymousClass0iw r4 = this.A00;
            C51972G9s.A1D(l2s, r4);
            UpcomingEvent upcomingEvent = lhl.A00;
            jpE.A01.setText(C63552Kz1.A00.format(new Date(C18810W3l.A02(upcomingEvent))));
            jpE.A03.setText(upcomingEvent.getTitle());
            TextView textView = jpE.A02;
            User BZw = upcomingEvent.BZw();
            if (BZw != null) {
                str = BZw.getUsername();
            } else {
                str = null;
            }
            textView.setText(str);
            View view = jpE.A00;
            LY9.A00(view, l2s, upcomingEvent, A0M, 12);
            TextView textView2 = jpE.A04;
            LY7.A00(textView2, 61, l2s, upcomingEvent);
            Context context = view.getContext();
            int i = 2131976020;
            if (upcomingEvent.getReminderEnabled()) {
                i = 2131976021;
            }
            DbT.A18(context, textView2, i);
            IgImageView igImageView = jpE.A05;
            igImageView.setVisibility(8);
            if (A0M == 0) {
                view.setPadding(0, 0, 8, 0);
            } else {
                view.setPadding(8, 0, 8, 0);
            }
            UpcomingEventMedia BPg = upcomingEvent.BPg();
            if (BPg == null || (BGO = BPg.BGO()) == null || (A03 = 1iI.A03(BGO)) == null) {
                IgImageView igImageView2 = jpE.A06;
                igImageView2.A0I = C64870LjW.A00;
                User BZw2 = upcomingEvent.BZw();
                if (BZw2 != null) {
                    ImageUrl Bh3 = BZw2.Bh3();
                    igImageView2.setUrl(new SimpleImageUrl(Bh3), r4);
                    igImageView.setVisibility(0);
                    igImageView.setUrl(new SimpleImageUrl(Bh3), r4);
                    return;
                }
                return;
            }
            IgImageView igImageView3 = jpE.A06;
            igImageView3.A0E = null;
            igImageView3.setUrl(A03, r4);
        }
    }

    public final Class modelClass() {
        return C64769Lhl.class;
    }

    public C61637KFn(AnonymousClass0iw r1, C63682L2s l2s, 0sP r3) {
        this.A01 = l2s;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        SimpleDateFormat simpleDateFormat = C63552Kz1.A00;
        return new C60667JpE(DbU.A09(layoutInflater, viewGroup, R.layout.layout_iglive_explore_upcoming_event_list_item, false));
    }
}
