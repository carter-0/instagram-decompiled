package X;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.archive.fragment.ArchiveReelCalendarFragment;
import com.instagram.model.reels.Reel;
import com.instagram.model.venue.Venue;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.UjW  reason: case insensitive filesystem */
public final class C15846UjW extends AnonymousClass3NK {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C15846UjW(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final boolean Dqe(View view) {
        String str;
        switch (this.A00) {
            case 0:
                C14910UEp uEp = (C14910UEp) this.A02;
                Reel reel = uEp.A05;
                Reel reel2 = (Reel) this.A03;
                if (!2PP.A00(reel, reel2)) {
                    return false;
                }
                Typeface typeface = C15849UjZ.A0D;
                ArchiveReelCalendarFragment archiveReelCalendarFragment = ((C15849UjZ) this.A01).A09;
                if (archiveReelCalendarFragment.A08 || !ArchiveReelCalendarFragment.A05(archiveReelCalendarFragment)) {
                    return true;
                }
                reel2.getClass();
                archiveReelCalendarFragment.A08 = true;
                archiveReelCalendarFragment.mLaunchingHolder = uEp;
                C20289Woe woe = new C20289Woe(uEp, archiveReelCalendarFragment, reel2);
                archiveReelCalendarFragment.A03 = woe;
                archiveReelCalendarFragment.A0D.postDelayed(woe, 2000);
                ((ViewGroup) uEp.itemView).setLayoutTransition(new LayoutTransition());
                uEp.A02.setVisibility(4);
                uEp.A01.setVisibility(0);
                uEp.A06.start();
                if (reel2.A0z(archiveReelCalendarFragment.getSession())) {
                    ArchiveReelCalendarFragment.A00(uEp, archiveReelCalendarFragment, reel2);
                    return true;
                } else if (!ArchiveReelCalendarFragment.A05(archiveReelCalendarFragment)) {
                    return true;
                } else {
                    C19479WaR waR = new C19479WaR(uEp, archiveReelCalendarFragment, reel2);
                    archiveReelCalendarFragment.A0F.add(waR);
                    archiveReelCalendarFragment.A01.A00(AnonymousClass3BU.ON_TAP, waR, reel2.getId(), "calendar_archive", Collections.emptyMap());
                    return true;
                }
            case 1:
                C17455VWi vWi = (C17455VWi) this.A03;
                boolean z = !vWi.A00;
                vWi.A00 = z;
                C17492VXv vXv = (C17492VXv) this.A01;
                View view2 = vXv.A01;
                view2.setSelected(z);
                C18737VzI vzI = ((C17217VMv) this.A02).A00;
                C18737VzI.A01(vzI);
                vzI.A02.A00(C18268Voi.A00(vzI.A04));
                boolean z2 = vWi.A00;
                Context context = vXv.A00;
                int i = 2131969861;
                if (z2) {
                    i = 2131969857;
                }
                C13989Tnp.A0z(context, view2, vWi.A01, i);
                return true;
            case 2:
                Reel reel3 = (Reel) this.A03;
                C19509Wav wav = (C19509Wav) this.A02;
                AnonymousClass3BQ r7 = AnonymousClass3BQ.LOCATION_FEED;
                List singletonList = Collections.singletonList(reel3);
                UlJ ulJ = ((VON) this.A01).A00;
                int i2 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                AnonymousClass32A r5 = ulJ.A05;
                r5.A0C = ulJ.A06;
                r5.A05 = new C16165Upq((Activity) ulJ.A00.getActivity(), (View) wav.A07, (C230222pE) null);
                r5.A05(reel3, r7, wav, singletonList, singletonList, singletonList);
                C15357Ub9 ub9 = ulJ.A04.A00;
                W05 w05 = ub9.A0D;
                String str2 = ub9.A0J;
                Venue venue = ub9.A0H;
                if (venue != null) {
                    str = venue.A04();
                } else {
                    str = null;
                }
                w05.A02((0xF) null, (0xF) null, "location_page", "tap_reel", (String) null, str2, str, reel3.getId(), (Map) null);
                return true;
            default:
                C15370UbN ubN = (C15370UbN) this.A03;
                User user = (User) this.A02;
                if (user == null) {
                    user = ubN.A01;
                }
                ubN.A00 = user;
                DbX.A14((Context) this.A01, AnonymousClass37D.A00);
                return true;
        }
    }
}
