package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: X.UbN  reason: case insensitive filesystem */
public final class C15370UbN extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "CountdownStickerConsumptionSheetFragment";
    public User A00;
    public User A01;
    public VUA A02;
    public String A03;
    public C19476WaO A04;
    public boolean A05;
    public final String A06 = "reel_countdown_sticker_consumption_sheet_fragment";
    public final AnonymousClass0eM A07 = C227642jf.A02(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean A1X;
        C45360Cv2 cv2;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        C19476WaO waO = this.A04;
        if (waO != null) {
            User user = waO.A00.A00;
            Context context = view2.getContext();
            TextView A0R = AnonymousClass7TG.A0R(view2, R.id.countdown_consumption_sheet_title);
            String str = waO.A00.A0B;
            if (str == null) {
                str = "";
            }
            A0R.setText(002.A0E(str, '\"', '\"'));
            TextView A0R2 = AnonymousClass7TG.A0R(view2, R.id.countdown_consumption_sheet_subtitle);
            A0R2.setText(DateFormat.getDateTimeInstance(0, 3).format(new Date(TimeUnit.SECONDS.toMillis(waO.A00()))));
            if (this.A01 != null && C309186Xg.A02(waO)) {
                0nA.A0T(A0R2, 0);
                View A0D = DbT.A0D(getLayoutInflater(), (ViewGroup) AnonymousClass7TE.A0b(view2, R.id.countdown_consumption_sheet_container), R.layout.countdown_sticker_consumption_sheet_actions_container, true);
                int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                Us7 A0Y = C13990Tnq.A0Y(A0D, R.id.countdown_consumption_sheet_follow_button);
                String A16 = AnonymousClass7TE.A16(context, 2131956774);
                String A162 = AnonymousClass7TE.A16(context, 2131956776);
                AnonymousClass0eM r9 = this.A07;
                AnonymousClass2fH A002 = AnonymousClass2fH.A00(AnonymousClass7TE.A0l(r9));
                String str2 = waO.A00.A06;
                if (str2 == null || !A002.A0F(str2)) {
                    A1X = AnonymousClass7TG.A1X(waO.A00.A03);
                } else {
                    String str3 = waO.A00.A06;
                    if (str3 == null || (cv2 = (C45360Cv2) A002.A03(str3)) == null) {
                        throw AnonymousClass7TE.A0y();
                    }
                    A1X = AnonymousClass7TF.A1Y(cv2.A00, true);
                }
                boolean z = !C309186Xg.A00(waO);
                A0Y.A01.setSelected(A1X);
                String str4 = this.A06;
                0qQ.A0B(str4, 2);
                Drawable drawable = context.getDrawable(R.drawable.countdown_sticker_consumption_sheet_follow_button);
                String str5 = A16;
                if (A1X) {
                    str5 = A162;
                }
                VI8.A00(A0Y, new C17685VcG((Drawable) null, drawable, (ImageUrl) null, new C15847UjX(waO, A0Y, this, A162, A16), str5, str4, 1.0f, false, z, false));
                VI8.A00(C13990Tnq.A0Y(A0D, R.id.countdown_consumption_sheet_reshare_button), new C17685VcG(context.getDrawable(R.drawable.empty_story_badge_elevated), (Drawable) null, DbX.A0l(AnonymousClass0t1.A01, r9).Bh3(), new C15846UjW(3, context, user, this), context.getString(2131956777), str4, 1.0f, false, true, false));
                if (!this.A05) {
                    TextView A0R3 = AnonymousClass7TG.A0R(A0D, R.id.countdown_consumption_sheet_footer);
                    if (user == null) {
                        user = this.A01;
                    }
                    0qQ.A0C(user, "null cannot be cast to non-null type com.instagram.user.model.User");
                    String username = user.getUsername();
                    AnonymousClass7AV.A07(new U2H(4, this, user), A0R3, username, DbY.A0c(context, username, 2131956778));
                }
            }
        }
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

    public final String getModuleName() {
        return this.A06;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
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

    public final void onBottomSheetClosed() {
        User user = this.A00;
        if (user != null) {
            VUA vua = this.A02;
            if (vua != null) {
                C310236ae r0 = vua.A01;
                1OP.A0A(r0.A07, 28D.A21, r0.A09, vua.A00, user);
            }
            this.A00 = null;
        }
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

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-740792020);
        C15370UbN.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A03 = requireArguments.getString(AnonymousClass000.A00(795));
        this.A05 = DbT.A1X(requireArguments, C273654mx.A00(2947));
        AnonymousClass0eM r4 = this.A07;
        this.A01 = 17h.A00(AnonymousClass7TE.A0l(r4)).A02(requireArguments.getString(C273654mx.A00(2203)));
        try {
            String string = requireArguments.getString(C273654mx.A00(2202));
            if (string != null) {
                BGi parseFromJson = C45635Czl.parseFromJson(0c9.A04.A01(AnonymousClass7TE.A0l(r4), string));
                0qQ.A07(parseFromJson);
                this.A04 = new C19476WaO(parseFromJson, C19476WaO.A03);
            }
        } catch (IOException unused) {
            0wb.A03(__redex_internal_original_name, "Could not parse json CountdownStickerModel for the countdown consumption sheet.");
        }
        AnonymousClass0fD.A09(1410371853, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(738074627);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_countdown_sticker_consumption_sheet, viewGroup, false);
        AnonymousClass0fD.A09(-1601526395, A022);
        return inflate;
    }
}
