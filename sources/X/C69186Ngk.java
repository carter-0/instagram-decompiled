package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ngk  reason: case insensitive filesystem */
public final class C69186Ngk extends C47518E6c implements C273494mf {
    public static final String __redex_internal_original_name = "CommentFilterBottomSheetFragment";
    public OBF A00;
    public C333797aA A01 = C70946OSt.A01.A00;
    public Integer A02 = AnonymousClass05K.A00;
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(new C58710IwJ(this, 43));
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "comment_filter_bottom_sheet_fragment";
    }

    public final boolean isElevated() {
        return true;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        int i = 0;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        01N A1H = 0jo.A1H();
        boolean A1b = G9t.A1b(this.A03);
        01N A1H2 = 0jo.A1H();
        Context context = getContext();
        String str2 = null;
        if (context != null) {
            str = context.getString(2131956363);
        } else {
            str = null;
        }
        DbV.A1V("NOT_SET", str, A1H2);
        Context context2 = getContext();
        if (context2 != null) {
            str2 = context2.getString(2131956365);
        }
        DbV.A1V("SUBSCRIBERS_ONLY", str2, A1H2);
        Object oTj = new C70962OTj(new C71472OlG(this, 0), this.A01.toString(), 0jo.A1I(A1H2));
        if (A1b) {
            A1H.add(oTj);
            DbV.A1W(A1H, true);
            String[] stringArray = DbV.A05(this).getStringArray(R.array.comments_sorting_options);
            0qQ.A07(stringArray);
            int length = stringArray.length;
            ArrayList A0v = DbS.A0v(length);
            int i2 = 0;
            while (i < length) {
                DbV.A1V(String.valueOf(i2), stringArray[i], A0v);
                i++;
                i2++;
            }
            List A0a = 00k.A0a(A0v);
            String str3 = "-1";
            switch (this.A02.intValue()) {
                case 0:
                    str3 = "0";
                    break;
                case 1:
                    str3 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                default:
                    throw AnonymousClass7TE.A1K();
            }
            DbU.A1F(new C71472OlG(this, 1), str3, A1H, A0a);
            oTj = new C70661OFi(new C71403Ok2(this, 21), AnonymousClass7TE.A16(requireContext(), 2131952976), (String) null, -1);
        }
        A1H.add(oTj);
        setBottomSheetMenuItems(0jo.A1I(A1H));
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }
}
