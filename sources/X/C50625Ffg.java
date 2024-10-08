package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.Ffg  reason: case insensitive filesystem */
public final class C50625Ffg implements G89 {
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public View A02;
    public View A03;
    public ProgressBar A04;
    public TextView A05;
    public TextView A06;
    public CircularImageView A07;
    public IgdsBottomButtonLayout A08;
    public IgdsHeadline A09;
    public IgdsSwitch A0A;
    public ProgressButton A0B;
    public final 0lg A0C;
    public final C49715F3a A0D;
    public final C51950G8t A0E;

    public C50625Ffg(0lg r2, C49715F3a f3a, C51950G8t g8t) {
        0qQ.A0B(r2, 1);
        this.A0C = r2;
        this.A0E = g8t;
        this.A0D = f3a;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final /* bridge */ /* synthetic */ void Dyq(Context context, View view, Object obj) {
        0qQ.A0B(view, 1);
        this.A04 = (ProgressBar) view.requireViewById(R.id.add_photo_progress_spinner);
        this.A03 = view.requireViewById(R.id.share_profile_photo_to_feed_container);
        this.A0A = (IgdsSwitch) view.requireViewById(R.id.share_profile_photo_to_feed_switch);
        this.A09 = DbZ.A0U(view, R.id.field_title_igds);
        this.A07 = DbU.A0X(view, R.id.add_photo_view);
        this.A0B = (ProgressButton) view.requireViewById(R.id.progress_button);
        this.A06 = DbU.A0G(view, R.id.skip_button);
        this.A05 = DbU.A0G(view, R.id.row_header);
        this.A02 = view.requireViewById(R.id.row_divider);
        this.A08 = DbT.A0c(view, R.id.action_button);
        this.A01 = new FP0((Object) this, 25);
        this.A00 = new FP0((Object) this, 26);
        CircularImageView circularImageView = this.A07;
        String str = "avatarView";
        if (circularImageView != null) {
            circularImageView.setStrokeAlpha(0);
            ? r1 = this.A07;
            if (r1 != 0) {
                View.OnClickListener onClickListener = this.A01;
                if (onClickListener != null) {
                    AnonymousClass0fU.A00(onClickListener, r1);
                    boolean A0I = C61670oa.A0I(this.A0C);
                    str = "skipButton";
                    IgdsBottomButtonLayout igdsBottomButtonLayout = this.A08;
                    if (A0I) {
                        if (igdsBottomButtonLayout != null) {
                            View.OnClickListener onClickListener2 = this.A01;
                            if (onClickListener2 != null) {
                                igdsBottomButtonLayout.setPrimaryActionOnClickListener(onClickListener2);
                                IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A08;
                                if (igdsBottomButtonLayout2 != null) {
                                    igdsBottomButtonLayout2.setSecondaryActionOnClickListener(new FP0((Object) this, 27));
                                    IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.A08;
                                    if (igdsBottomButtonLayout3 != null) {
                                        igdsBottomButtonLayout3.setDividerVisible(true);
                                        ProgressButton progressButton = this.A0B;
                                        if (progressButton != null) {
                                            progressButton.setVisibility(8);
                                            TextView textView = this.A06;
                                            if (textView != null) {
                                                textView.setVisibility(8);
                                                return;
                                            }
                                        }
                                        0qQ.A0F("progressButton");
                                        throw AnonymousClass00P.createAndThrow();
                                    }
                                }
                            }
                        }
                    } else if (igdsBottomButtonLayout != null) {
                        igdsBottomButtonLayout.setVisibility(8);
                        ProgressButton progressButton2 = this.A0B;
                        if (progressButton2 != null) {
                            View.OnClickListener onClickListener3 = this.A01;
                            if (onClickListener3 != null) {
                                AnonymousClass0fU.A00(onClickListener3, progressButton2);
                                TextView textView2 = this.A06;
                                if (textView2 != null) {
                                    FP0.A00(textView2, 28, this);
                                    return;
                                }
                            }
                        }
                        0qQ.A0F("progressButton");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    0qQ.A0F("actionButtonLayout");
                    throw AnonymousClass00P.createAndThrow();
                }
                0qQ.A0F("showCaptureFlowDialogClickListener");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ void CwD(Context context, Object obj) {
        ProgressBar progressBar = this.A04;
        if (progressBar == null) {
            0qQ.A0F("addPhotoProgressSpinner");
            throw AnonymousClass00P.createAndThrow();
        } else {
            progressBar.setVisibility(8);
        }
    }

    public final /* bridge */ /* synthetic */ void D8T(Context context, Object obj) {
        String str;
        IgdsHeadline igdsHeadline = this.A09;
        if (igdsHeadline == null) {
            str = "headline";
        } else {
            igdsHeadline.setOnClickListener((View.OnClickListener) null);
            ProgressButton progressButton = this.A0B;
            if (progressButton == null) {
                str = "progressButton";
            } else {
                progressButton.setOnClickListener((View.OnClickListener) null);
                TextView textView = this.A06;
                if (textView == null) {
                    str = "skipButton";
                } else {
                    textView.setOnClickListener((View.OnClickListener) null);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v6, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r3v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final /* bridge */ /* synthetic */ void FJp(Context context, Object obj) {
        IgdsBottomButtonLayout igdsBottomButtonLayout;
        String str;
        C49652F0j f0j = (C49652F0j) obj;
        0qQ.A0B(f0j, 1);
        String str2 = "skipButton";
        int i = 0;
        String str3 = "sharePhotoToFeedContainer";
        if (f0j.A00 == null) {
            View view = this.A03;
            if (view != null) {
                view.setVisibility(8);
                ? r1 = this.A07;
                if (r1 != 0) {
                    r1.setBackgroundResource(R.drawable.reg_photo);
                    ? r3 = this.A07;
                    if (r3 != 0) {
                        int A072 = 2Yu.A07(context);
                        DbX.A11(r3.getContext(), r3.getBackground().mutate(), A072);
                        if (C61670oa.A0I(this.A0C)) {
                            IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A08;
                            if (igdsBottomButtonLayout2 != null) {
                                igdsBottomButtonLayout2.setPrimaryActionText(context.getResources().getString(2131952337));
                                igdsBottomButtonLayout = this.A08;
                                if (igdsBottomButtonLayout != null) {
                                    str = context.getResources().getString(2131973923);
                                }
                            }
                            0qQ.A0F("actionButtonLayout");
                            throw AnonymousClass00P.createAndThrow();
                        }
                        ProgressButton progressButton = this.A0B;
                        if (progressButton != null) {
                            progressButton.setText(2131952337);
                            ProgressButton progressButton2 = this.A0B;
                            if (progressButton2 != null) {
                                View.OnClickListener onClickListener = this.A01;
                                if (onClickListener == null) {
                                    str2 = "showCaptureFlowDialogClickListener";
                                } else {
                                    AnonymousClass0fU.A00(onClickListener, progressButton2);
                                    TextView textView = this.A06;
                                    if (textView != null) {
                                        textView.setVisibility(0);
                                        return;
                                    }
                                }
                                0qQ.A0F(str2);
                                throw AnonymousClass00P.createAndThrow();
                            }
                        }
                        0qQ.A0F("progressButton");
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
                0qQ.A0F("avatarView");
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F(str3);
            throw AnonymousClass00P.createAndThrow();
        }
        ? r0 = this.A07;
        if (r0 != 0) {
            r0.setBackground((Drawable) null);
            View view2 = this.A03;
            if (view2 != null) {
                boolean A1Q = AnonymousClass7TF.A1Q(view2.getVisibility());
                View view3 = this.A03;
                if (view3 != null) {
                    boolean z = f0j.A03;
                    C51950G8t g8t = this.A0E;
                    if (!z && g8t == null) {
                        i = 8;
                    }
                    view3.setVisibility(i);
                    if (!A1Q) {
                        View view4 = this.A03;
                        if (view4 != null) {
                            if (view4.getVisibility() == 0) {
                                IgdsSwitch igdsSwitch = this.A0A;
                                if (igdsSwitch == null) {
                                    str2 = "sharePhotoToFeedSwitch";
                                    0qQ.A0F(str2);
                                    throw AnonymousClass00P.createAndThrow();
                                }
                                igdsSwitch.setChecked(true);
                            }
                        }
                    }
                    str3 = "nextListener";
                    if (C61670oa.A0I(this.A0C)) {
                        IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.A08;
                        if (igdsBottomButtonLayout3 != null) {
                            String string = context.getResources().getString(2131968361);
                            View.OnClickListener onClickListener2 = this.A00;
                            if (onClickListener2 != null) {
                                igdsBottomButtonLayout3.setPrimaryAction(string, onClickListener2);
                                igdsBottomButtonLayout = this.A08;
                                if (igdsBottomButtonLayout != null) {
                                    str = "";
                                }
                            }
                        }
                        0qQ.A0F("actionButtonLayout");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    ProgressButton progressButton3 = this.A0B;
                    if (progressButton3 != null) {
                        progressButton3.setText(2131968361);
                        ProgressButton progressButton4 = this.A0B;
                        if (progressButton4 != null) {
                            View.OnClickListener onClickListener3 = this.A00;
                            if (onClickListener3 != null) {
                                AnonymousClass0fU.A00(onClickListener3, progressButton4);
                                TextView textView2 = this.A06;
                                if (textView2 != null) {
                                    textView2.setVisibility(8);
                                    return;
                                }
                                0qQ.A0F(str2);
                                throw AnonymousClass00P.createAndThrow();
                            }
                        }
                    }
                    0qQ.A0F("progressButton");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            0qQ.A0F(str3);
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("avatarView");
        throw AnonymousClass00P.createAndThrow();
        igdsBottomButtonLayout.setSecondaryActionText(str);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public final /* bridge */ /* synthetic */ void FLE(Context context, Object obj) {
        C49652F0j f0j = (C49652F0j) obj;
        0qQ.A0B(f0j, 1);
        ? r1 = this.A07;
        String str = "avatarView";
        if (r1 != 0) {
            r1.setImageBitmap(f0j.A00);
            Bitmap bitmap = f0j.A00;
            CircularImageView circularImageView = this.A07;
            if (bitmap != null) {
                if (circularImageView != null) {
                    circularImageView.setStrokeAlpha(circularImageView.A00);
                    return;
                }
            } else if (circularImageView != null) {
                circularImageView.setStrokeAlpha(0);
                ProgressBar progressBar = this.A04;
                if (progressBar == null) {
                    str = "addPhotoProgressSpinner";
                } else {
                    progressBar.setVisibility(8);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ void FLz(Context context, UserSession userSession, Object obj) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C49652F0j f0j = (C49652F0j) obj;
        AnonymousClass7TG.A1O(f0j, userSession);
        Bitmap bitmap = f0j.A00;
        String str = "headline";
        IgdsHeadline igdsHeadline = this.A09;
        if (bitmap != null) {
            if (igdsHeadline != null) {
                igdsHeadline.setHeadline(2131970047);
                IgdsHeadline igdsHeadline2 = this.A09;
                if (igdsHeadline2 != null) {
                    igdsHeadline2.setBody(0);
                    IgdsHeadline igdsHeadline3 = this.A09;
                    if (igdsHeadline3 != null) {
                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
                        int A022 = AnonymousClass7TF.A02(context, R.dimen.account_discovery_bottom_gap);
                        View A0G = AnonymousClass7TF.A0G(igdsHeadline3, R.id.igds_headline_link);
                        ViewGroup.LayoutParams layoutParams = A0G.getLayoutParams();
                        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            if (marginLayoutParams != null) {
                                marginLayoutParams.setMargins(0, dimensionPixelSize, 0, A022);
                            }
                        } else {
                            marginLayoutParams = null;
                        }
                        A0G.setLayoutParams(marginLayoutParams);
                        IgdsHeadline igdsHeadline4 = this.A09;
                        if (igdsHeadline4 != null) {
                            String string = context.getResources().getString(2131954990);
                            View.OnClickListener onClickListener = this.A01;
                            if (onClickListener == null) {
                                str = "showCaptureFlowDialogClickListener";
                            } else {
                                igdsHeadline4.setAction(string, onClickListener);
                                if (182.A06(0Tu.A06, userSession, 36315400187022504L)) {
                                    String A16 = AnonymousClass7TE.A16(context, 2131964884);
                                    Uri A092 = DbT.A09(SQU.A01(context, "https://help.instagram.com/557544397610546?ref=igapp"));
                                    Spanned A072 = DbU.A07(context.getResources(), A16, 2131952339);
                                    0qQ.A07(A072);
                                    SpannableStringBuilder A0C2 = DbS.A0C(SpannableString.valueOf(A072));
                                    AnonymousClass7AV.A05(A0C2, new C46678Dj7(A092), A16);
                                    TextView textView = this.A05;
                                    str = "headerView";
                                    if (textView != null) {
                                        textView.setText(A0C2);
                                        TextView textView2 = this.A05;
                                        if (textView2 != null) {
                                            DbT.A1H(textView2);
                                            TextView textView3 = this.A05;
                                            if (textView3 != null) {
                                                textView3.setVisibility(0);
                                                View view = this.A02;
                                                if (view == null) {
                                                    str = "divider";
                                                } else {
                                                    view.setVisibility(0);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        } else if (igdsHeadline != null) {
            igdsHeadline.setHeadline(2131952341);
            IgdsHeadline igdsHeadline5 = this.A09;
            if (igdsHeadline5 != null) {
                igdsHeadline5.setBody(2131952340);
                IgdsHeadline igdsHeadline6 = this.A09;
                if (igdsHeadline6 != null) {
                    igdsHeadline6.setOnClickListener((View.OnClickListener) null);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
