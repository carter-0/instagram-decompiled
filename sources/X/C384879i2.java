package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.android.R;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: X.9i2  reason: invalid class name and case insensitive filesystem */
public final class C384879i2 extends AnonymousClass4DH {
    public static final List A0f = 0sr.A1P(new Integer[]{A01(255, 244, 155), A01(255, 240, 107), A01(255, 197, 132), A01(255, 179, 90), A01(C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION, 175, 254), A01(246, 137, 255), A01(200, 175, 253), A01(173, 136, 252), A01(145, 96, 251)});
    public static final List A0g = 0sr.A1P(new String[]{"❤️", "💙", "💚", "💛", "💔", "❤️‍🩹", "💜", "🤎", "❤️‍🔥", "🤍", "🖤", "🧡", "💖", "💝", "🫀"});
    public static final Map A0h;
    public static final Map A0i;
    public static final Map A0j;
    public static final List A0k = 0sr.A1P(new String[]{"🍷", "🍸", "🥃", "🥛", "🍹", "🫙"});
    public static final Map A0l;
    public static final String __redex_internal_original_name = "EmojiPongFragment";
    public float A00;
    public float A01;
    public float A02 = 1.0f;
    public float A03;
    public int A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public FrameLayout A09;
    public ImageView A0A;
    public ImageView A0B;
    public ImageView A0C;
    public TextView A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public TextView A0I;
    public TextView A0J;
    public TextView A0K;
    public TextView A0L;
    public TextView A0M;
    public TextView A0N;
    public TextView A0O;
    public TextView A0P;
    public TextView A0Q;
    public TextView A0R;
    public String A0S;
    public boolean A0T;
    public float A0U = -1.0f;
    public final AnonymousClass0eM A0V;
    public final AnonymousClass0eM A0W;
    public final AnonymousClass0eM A0X;
    public final AnonymousClass0eM A0Y;
    public final AnonymousClass0eM A0Z;
    public final AnonymousClass0eM A0a;
    public final AnonymousClass0eM A0b;
    public final AnonymousClass0eM A0c;
    public final AnonymousClass0eM A0d;
    public final AnonymousClass0eM A0e;

    public static final void A04(ValueAnimator.AnimatorUpdateListener animatorUpdateListener, ValueAnimator valueAnimator, C384879i2 r4) {
        valueAnimator.addUpdateListener(new AJV(0, animatorUpdateListener, r4));
    }

    public final String getModuleName() {
        return C66579MXk.A00(889);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        FragmentActivity activity;
        Window window;
        Context context;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View view2 = this.mView;
        if (view2 != null) {
            this.A06 = view2.findViewById(R.id.paddle);
        }
        View view3 = this.mView;
        if (view3 != null) {
            TextView A0d2 = AnonymousClass7TE.A0d(view3, R.id.ball);
            String str = this.A0S;
            if (str != null) {
                A0d2.setText(str);
                this.A0E = A0d2;
            }
            0qQ.A0F("emoji");
            throw AnonymousClass00P.createAndThrow();
        }
        View view4 = this.mView;
        if (view4 != null) {
            TextView A0d3 = AnonymousClass7TE.A0d(view4, R.id.projectile);
            Map map = A0j;
            String str2 = this.A0S;
            if (str2 != null) {
                A0d3.setText((CharSequence) map.get(str2));
                if (AnonymousClass7TF.A1Z(this.A0X)) {
                    A0d3.setText("💗");
                }
                this.A0P = A0d3;
            }
            0qQ.A0F("emoji");
            throw AnonymousClass00P.createAndThrow();
        }
        View view5 = this.mView;
        if (view5 != null) {
            this.A0D = AnonymousClass7TE.A0d(view5, R.id.arrow);
        }
        View view6 = this.mView;
        if (!(view6 == null || (context = getContext()) == null)) {
            TextView A0d4 = AnonymousClass7TE.A0d(view6, R.id.current_score);
            A0d4.setTypeface(0oh.A02(context));
            this.A0H = A0d4;
        }
        AnonymousClass0eM r2 = this.A0W;
        boolean A1Z = AnonymousClass7TF.A1Z(r2);
        View view7 = this.mView;
        if (A1Z) {
            if (view7 != null) {
                if (((String[]) this.A0a.getValue()).length == 1) {
                    this.A08 = view7.findViewById(R.id.social_high_score_container);
                    this.A0C = (ImageView) view7.findViewById(R.id.facepile);
                    this.A0Q = AnonymousClass7TE.A0d(view7, R.id.social_high_score_left);
                    this.A0R = AnonymousClass7TE.A0d(view7, R.id.social_high_score_right);
                    this.A0F = AnonymousClass7TE.A0d(view7, R.id.crown_left);
                    this.A0G = AnonymousClass7TE.A0d(view7, R.id.crown_right);
                } else {
                    this.A05 = view7.findViewById(R.id.leaderboard_container);
                    this.A0M = AnonymousClass7TE.A0d(view7, R.id.leaderboard_high_score);
                    this.A0N = AnonymousClass7TE.A0d(view7, R.id.leaderboard_label);
                    this.A0B = (ImageView) view7.findViewById(R.id.leaderboard_icon);
                }
            }
        } else if (view7 != null) {
            TextView A0d5 = AnonymousClass7TE.A0d(view7, R.id.high_score);
            A0d5.setText(A02(this));
            this.A0L = A0d5;
        }
        View view8 = this.mView;
        if (view8 != null) {
            TextView A0d6 = AnonymousClass7TE.A0d(view8, R.id.explosion);
            String str3 = this.A0S;
            if (str3 != null) {
                A0d6.setText(str3);
                this.A0I = A0d6;
            }
            0qQ.A0F("emoji");
            throw AnonymousClass00P.createAndThrow();
        }
        View view9 = this.mView;
        if (view9 != null) {
            this.A09 = (FrameLayout) view9.findViewById(R.id.emoji_shower_container);
        }
        View view10 = this.mView;
        if (view10 != null) {
            ImageView imageView = (ImageView) view10.findViewById(R.id.dismiss_button);
            AOX.A00(imageView, 27, this);
            this.A0A = imageView;
        }
        View view11 = this.mView;
        if (view11 != null) {
            View findViewById = view11.findViewById(R.id.restart_button);
            AOX.A00(findViewById, 28, this);
            this.A07 = findViewById;
        }
        View view12 = this.mView;
        if (view12 != null) {
            TextView A0d7 = AnonymousClass7TE.A0d(view12, R.id.game_over_label);
            A0d7.setTypeface(0oh.A02(A0d7.getContext()));
            this.A0K = A0d7;
        }
        View view13 = this.mView;
        if (view13 != null) {
            TextView A0d8 = AnonymousClass7TE.A0d(view13, R.id.final_score);
            A0d8.setTypeface(0oh.A02(A0d8.getContext()));
            this.A0J = A0d8;
        }
        View view14 = this.mView;
        if (view14 != null) {
            TextView A0d9 = AnonymousClass7TE.A0d(view14, R.id.new_high_score);
            A0d9.setTypeface(0oh.A02(A0d9.getContext()));
            this.A0O = A0d9;
        }
        View view15 = this.mView;
        if (!(view15 == null || (activity = getActivity()) == null || (window = activity.getWindow()) == null)) {
            window.addFlags(512);
            0nA.A0c(view15, 2db.A01(activity));
            0nA.A0X(view15, AnonymousClass2uJ.A00);
            A07(this, true);
        }
        View view16 = this.mView;
        if (view16 != null) {
            view16.setOnTouchListener(new AP3(this, 6));
        }
        if (AnonymousClass7TF.A1Z(r2)) {
            2YL r9 = (2YL) this.A0d.getValue();
            Object value = this.A0a.getValue();
            String str4 = (String) this.A0c.getValue();
            AnonymousClass7TF.A1H(value, str4);
            C318136oS A002 = C318116oQ.A00(r9);
            C66174MGl mGl = new C66174MGl((Object) r9, value, str4, (AnonymousClass4D7) null, 33);
            19B r1 = 19B.A00;
            1Eo.A05(r1, mGl, A002);
            Context context2 = getContext();
            if (context2 != null) {
                07U r4 = 07U.A05;
                AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
                1Eo.A05(r1, new MHF(viewLifecycleOwner, r4, context2, this, (AnonymousClass4D7) null, 23), AnonymousClass07a.A00(viewLifecycleOwner));
            }
        }
        view.post(new C40863AkX(this));
    }

    static {
        Float valueOf = Float.valueOf(1.3f);
        0eP A1L = AnonymousClass7TE.A1L("😡", valueOf);
        0eP A1L2 = AnonymousClass7TE.A1L("🤬", valueOf);
        Float valueOf2 = Float.valueOf(1.2f);
        0eP A1L3 = AnonymousClass7TE.A1L("😤", valueOf2);
        0eP A1L4 = AnonymousClass7TE.A1L("😠", valueOf2);
        Float valueOf3 = Float.valueOf(5.0f);
        A0l = 0Yt.A06(new 0eP[]{A1L, A1L2, A1L3, A1L4, AnonymousClass7TE.A1L("👹", valueOf3), AnonymousClass7TE.A1L("🐢", Float.valueOf(0.8f))});
        A0i = 0Yt.A06(new 0eP[]{AnonymousClass7TE.A1L("😡", valueOf3), AnonymousClass7TE.A1L("🤬", valueOf3), AnonymousClass7TE.A1L("😤", valueOf3), AnonymousClass7TE.A1L("😠", valueOf3), AnonymousClass7TE.A1L("👹", valueOf3), AnonymousClass7TE.A1L("🪃", Float.valueOf(8.0f))});
        0eP[] r3 = new 0eP[30];
        boolean A1X = AnonymousClass7TF.A1X(new 0eP[]{AnonymousClass7TE.A1L("🥚", "🐣"), AnonymousClass7TE.A1L("🐣", "🐥"), AnonymousClass7TE.A1L("🐥", "🐓"), AnonymousClass7TE.A1L("🌱", "🌿"), AnonymousClass7TE.A1L("🌿", "🌳"), AnonymousClass7TE.A1L("🍇", "🍷"), AnonymousClass7TE.A1L("🐛", "🦋"), AnonymousClass7TE.A1L("🍏", "🍎"), AnonymousClass7TE.A1L("👶", "🧒"), AnonymousClass7TE.A1L("🧒", "👦"), AnonymousClass7TE.A1L("👦", "👨"), AnonymousClass7TE.A1L("🌙", "🌛"), AnonymousClass7TE.A1L("🌛", "🌜"), AnonymousClass7TE.A1L("🌜", "🌝"), AnonymousClass7TE.A1L("🌝", "🌙"), AnonymousClass7TE.A1L("🌧️", "⛈️"), AnonymousClass7TE.A1L("🌕", "🌖"), AnonymousClass7TE.A1L("🌖", "🌗"), AnonymousClass7TE.A1L("🌗", "🌘"), AnonymousClass7TE.A1L("🌘", "🌑"), AnonymousClass7TE.A1L("🌑", "🌒"), AnonymousClass7TE.A1L("🌒", "🌓"), AnonymousClass7TE.A1L("🌓", "🌔"), AnonymousClass7TE.A1L("🌔", "🌕"), AnonymousClass7TE.A1L("🥔", "🍟"), AnonymousClass7TE.A1L("🐴", "🦄"), AnonymousClass7TE.A1L("🌎", "🌍")}, r3);
        System.arraycopy(new 0eP[]{AnonymousClass7TE.A1L("🌍", "🌏"), AnonymousClass7TE.A1L("🌏", "🌎"), AnonymousClass7TE.A1L("🌾", "🥖")}, A1X ? 1 : 0, r3, 27, 3);
        A0h = 0Yt.A06(r3);
        0eP[] r47 = new 0eP[89];
        System.arraycopy(new 0eP[]{AnonymousClass7TE.A1L("😅", "💧"), AnonymousClass7TE.A1L("🤣", "💧"), AnonymousClass7TE.A1L("😢", "💧"), AnonymousClass7TE.A1L("😂", "💧"), AnonymousClass7TE.A1L("🥲", "💧"), AnonymousClass7TE.A1L("😹", "💧"), AnonymousClass7TE.A1L("😭", "💦"), new 0eP("🔥", "🔥"), AnonymousClass7TE.A1L("🌪️", "🍃"), AnonymousClass7TE.A1L("😍", "❤️"), AnonymousClass7TE.A1L("💩", "🪰"), AnonymousClass7TE.A1L("🛸", "👽"), AnonymousClass7TE.A1L("👑", "💎"), AnonymousClass7TE.A1L("🦄", "🌈"), AnonymousClass7TE.A1L("🤖", "⚙️"), AnonymousClass7TE.A1L("😡", "💥"), AnonymousClass7TE.A1L("🥳", "🎉"), AnonymousClass7TE.A1L("😴", "💤"), AnonymousClass7TE.A1L("🤑", "💸"), AnonymousClass7TE.A1L("🥵", "🔥"), AnonymousClass7TE.A1L("🥶", "❄️"), AnonymousClass7TE.A1L("🤕", "💊"), AnonymousClass7TE.A1L("🤒", "🌡️"), AnonymousClass7TE.A1L("👹", "🔥"), AnonymousClass7TE.A1L("👺", "🔥"), AnonymousClass7TE.A1L("🤧", "💨"), AnonymousClass7TE.A1L("🥴", "🌀")}, A1X, r47, A1X, 27);
        Object obj = "🥚";
        System.arraycopy(new 0eP[]{AnonymousClass7TE.A1L("👽", "🛸"), AnonymousClass7TE.A1L("🎃", "🍬"), AnonymousClass7TE.A1L("😇", "✨"), AnonymousClass7TE.A1L("🤓", "📚"), AnonymousClass7TE.A1L("😎", "🕶️"), AnonymousClass7TE.A1L("👸", "👑"), AnonymousClass7TE.A1L("💐", "🌸"), AnonymousClass7TE.A1L("👨‍🚀", "🚀"), AnonymousClass7TE.A1L("👩‍🚀", "🌕"), AnonymousClass7TE.A1L("👨‍🚒", "🔥"), AnonymousClass7TE.A1L("👩‍🚒", "🧯"), AnonymousClass7TE.A1L("👮", "🚓"), AnonymousClass7TE.A1L("🧙", "✨"), AnonymousClass7TE.A1L("🧚", "✨"), AnonymousClass7TE.A1L("🧛", "🦇"), AnonymousClass7TE.A1L("🧜‍♀️", "💧"), AnonymousClass7TE.A1L("🧜‍♂️", "💧"), AnonymousClass7TE.A1L("🦸", "⚡"), AnonymousClass7TE.A1L("🧝", "🌲"), AnonymousClass7TE.A1L("🧞", "💨"), AnonymousClass7TE.A1L("🧟", "🧠"), AnonymousClass7TE.A1L("🌟", "✨"), AnonymousClass7TE.A1L("🎶", "🎵"), AnonymousClass7TE.A1L("🐓", obj), AnonymousClass7TE.A1L("🐔", obj), new 0eP("❄️", "❄️"), AnonymousClass7TE.A1L("💦", "💧")}, A1X, r47, 27, 27);
        System.arraycopy(new 0eP[]{AnonymousClass7TE.A1L("🚗", "💨"), AnonymousClass7TE.A1L("🚀", "🔥"), AnonymousClass7TE.A1L("💖", "✨"), AnonymousClass7TE.A1L("🍕", "🧀"), AnonymousClass7TE.A1L("🚔", "🚨"), AnonymousClass7TE.A1L("🚓", "🚨"), AnonymousClass7TE.A1L("🧋", "•"), AnonymousClass7TE.A1L("☠️", "🦴"), AnonymousClass7TE.A1L("💀", "🦴"), AnonymousClass7TE.A1L("😵‍💫", "🌀"), AnonymousClass7TE.A1L("🥸", "👃"), AnonymousClass7TE.A1L("🤩", "⭐️"), AnonymousClass7TE.A1L("🧠", "💡"), AnonymousClass7TE.A1L("👀", "👁"), AnonymousClass7TE.A1L("🤳", "📱"), AnonymousClass7TE.A1L("👩‍❤️‍👩", "❤️"), AnonymousClass7TE.A1L("💑", "❤️"), AnonymousClass7TE.A1L("👨‍❤️‍👨", "❤️"), AnonymousClass7TE.A1L("👩‍❤️‍👨", "❤️"), AnonymousClass7TE.A1L("👩‍❤️‍💋‍👩", "❤️"), AnonymousClass7TE.A1L("💏", "❤️"), AnonymousClass7TE.A1L("👨‍❤️‍💋‍👨", "❤️"), AnonymousClass7TE.A1L("🎩", "🐇"), AnonymousClass7TE.A1L("🥷🏻", "✦"), AnonymousClass7TE.A1L("👩🏼‍🌾", "🥕"), AnonymousClass7TE.A1L("🧑🏼‍🌾", "🥕"), AnonymousClass7TE.A1L("👨🏼‍🌾", "🥕")}, A1X, r47, 54, 27);
        System.arraycopy(new 0eP[]{AnonymousClass7TE.A1L("🐝", "🍯"), AnonymousClass7TE.A1L("🕷", "🥚"), AnonymousClass7TE.A1L("🐉", "龙"), AnonymousClass7TE.A1L("🎂", "🍰"), AnonymousClass7TE.A1L("🫖", "🍵"), AnonymousClass7TE.A1L("🍾", "🥂"), AnonymousClass7TE.A1L("🎮", "👾"), AnonymousClass7TE.A1L("❤️‍🔥", "🔥")}, A1X, r47, 81, 8);
        A0j = 0Yt.A06(r47);
    }

    private final int A00() {
        float f;
        Map map = A0l;
        String str = this.A0S;
        if (str == null) {
            0qQ.A0F("emoji");
            throw AnonymousClass00P.createAndThrow();
        }
        Number number = (Number) map.get(str);
        if (number != null) {
            f = number.floatValue();
        } else {
            f = 1.0f;
        }
        return (int) ((20.0f * f) + ((float) this.A04));
    }

    private final void A03() {
        String str;
        if (AnonymousClass7TF.A1Z(this.A0X)) {
            List list = A0g;
            AnonymousClass0eM r4 = this.A0Z;
            String A19 = AnonymousClass7TE.A19(list, ((Random) r4.getValue()).nextInt(list.size()));
            this.A0S = A19;
            TextView textView = this.A0E;
            if (textView == null) {
                str = "ballView";
            } else {
                String str2 = "emoji";
                if (A19 != null) {
                    textView.setText(A19);
                    TextView textView2 = this.A0I;
                    if (textView2 == null) {
                        str = "explosionView";
                    } else {
                        String str3 = this.A0S;
                        if (str3 != null) {
                            textView2.setText(str3);
                            View view = this.mView;
                            if (view != null && ((Random) r4.getValue()).nextFloat() < 0.025f) {
                                TextView textView3 = this.A0D;
                                if (textView3 == null) {
                                    str2 = "arrowView";
                                } else {
                                    textView3.setVisibility(0);
                                    ValueAnimator A0J2 = AnonymousClass7TG.A0J(ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}), 1000);
                                    A0J2.setInterpolator(new LinearInterpolator());
                                    A04(new AJV(1, view, this), A0J2, this);
                                    C41655Ay7.A00(A0J2, this, 37);
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                    }
                }
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return (AnonymousClass0wW) this.A0b.getValue();
    }

    public C384879i2() {
        C41655Ay7 ay7 = new C41655Ay7(this, 48);
        C41655Ay7 ay72 = new C41655Ay7(this, 44);
        0eO r2 = 0eO.A02;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r2, new C41655Ay7(ay72, 45));
        this.A0d = new C227862kA(new C41655Ay7(A002, 46), ay7, new C73664Phd(36, A002, (Object) null), new 0Yh(C60135JgG.class));
        this.A0c = AnonymousClass0eN.A00(r2, new C41655Ay7(this, 47));
        this.A0a = AnonymousClass0eN.A00(r2, new C41655Ay7(this, 40));
        this.A0Y = AnonymousClass0eN.A00(r2, new C41655Ay7(this, 39));
        this.A0Z = AnonymousClass0eN.A00(r2, C41615AxT.A00);
        this.A0X = AnonymousClass0eN.A00(r2, new C41655Ay7(this, 36));
        this.A0W = AnonymousClass0eN.A00(r2, new C41655Ay7(this, 35));
        this.A0e = AnonymousClass0eN.A00(r2, C41616AxU.A00);
        this.A0V = AnonymousClass0eN.A00(r2, C41614AxS.A00);
        this.A0b = C227642jf.A02(this);
    }

    public static Integer A01(int i, int i2, int i3) {
        return Integer.valueOf(Color.rgb(i, i2, i3));
    }

    public static final String A02(C384879i2 r4) {
        String string = r4.getString(2131961598, new Object[]{StringFormatUtil.formatStrLocaleSafe("%03d", Integer.valueOf(((1Av) r4.A0Y.getValue()).A01.getInt(C66579MXk.A00(127), 0)))});
        0qQ.A07(string);
        return string;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005e, code lost:
        if ((r3 + ((float) (r0.getWidth() / 2))) > X.AnonymousClass7TE.A02(r4)) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C384879i2 r12) {
        /*
            android.content.Context r0 = r12.getContext()
            if (r0 == 0) goto L_0x001a
            android.view.View r4 = r12.mView
            if (r4 == 0) goto L_0x001a
            boolean r0 = r12.A0T
            r1 = 16
            if (r0 == 0) goto L_0x001b
            X.AkY r0 = new X.AkY
            r0.<init>(r12)
        L_0x0015:
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r4.postDelayed(r0, r1)
        L_0x001a:
            return
        L_0x001b:
            float r5 = r12.A00
            float r3 = r12.A02
            int r0 = r12.A00()
            float r0 = (float) r0
            float r3 = r3 * r0
            float r5 = r5 + r3
            r12.A00 = r5
            float r5 = r12.A01
            float r3 = r12.A0U
            int r0 = r12.A00()
            float r0 = (float) r0
            float r3 = r3 * r0
            float r5 = r5 + r3
            r12.A01 = r5
            float r3 = r12.A00
            android.widget.TextView r0 = r12.A0E
            java.lang.String r11 = "ballView"
            if (r0 == 0) goto L_0x01f5
            int r0 = r0.getWidth()
            int r0 = r0 / 2
            float r0 = (float) r0
            float r3 = r3 - r0
            r10 = 0
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0060
            float r3 = r12.A00
            android.widget.TextView r0 = r12.A0E
            if (r0 == 0) goto L_0x01f5
            int r0 = r0.getWidth()
            int r0 = r0 / 2
            float r0 = (float) r0
            float r3 = r3 + r0
            float r0 = X.AnonymousClass7TE.A02(r4)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c0
        L_0x0060:
            float r0 = r12.A02
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = r0 * r5
            r12.A02 = r0
            r12.A03()
            android.view.View r6 = r12.mView
            if (r6 == 0) goto L_0x00c0
            java.lang.String r3 = r12.A0S
            java.lang.String r7 = "emoji"
            if (r3 == 0) goto L_0x0273
            java.lang.String r0 = "👽"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "🛸"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00c0
        L_0x0084:
            X.0eM r0 = r12.A0Z
            java.lang.Object r0 = r0.getValue()
            java.util.Random r0 = (java.util.Random) r0
            float r3 = r0.nextFloat()
            r0 = 1048576000(0x3e800000, float:0.25)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c0
            float r0 = r12.A02
            float r0 = r0 * r5
            r12.A02 = r0
            float r3 = r12.A00
            android.widget.TextView r0 = r12.A0E
            r7 = r11
            if (r0 == 0) goto L_0x0273
            int r0 = r0.getWidth()
            int r0 = r0 / 2
            float r0 = (float) r0
            float r3 = r3 - r0
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            float r3 = r12.A00
            float r0 = X.AnonymousClass7TE.A02(r6)
            if (r5 >= 0) goto L_0x016f
            float r3 = r3 + r0
            android.widget.TextView r0 = r12.A0E
            if (r0 == 0) goto L_0x0273
            float r0 = X.AnonymousClass7TE.A02(r0)
            float r3 = r3 - r0
        L_0x00be:
            r12.A00 = r3
        L_0x00c0:
            float r3 = r12.A01
            android.widget.TextView r0 = r12.A0E
            if (r0 == 0) goto L_0x01f5
            int r0 = r0.getHeight()
            int r0 = r0 / 2
            float r0 = (float) r0
            float r3 = r3 - r0
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x00dc
            float r3 = r12.A0U
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r3 * r0
            r12.A0U = r3
            r12.A03()
        L_0x00dc:
            float r3 = r12.A01
            android.view.View r0 = r12.A06
            java.lang.String r6 = "paddleView"
            if (r0 == 0) goto L_0x030e
            float r0 = r0.getY()
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x027b
            android.content.Context r0 = r12.getContext()
            if (r0 == 0) goto L_0x001a
            android.widget.TextView r1 = r12.A0E
            if (r1 == 0) goto L_0x01f5
            r0 = 8
            r1.setVisibility(r0)
            android.content.Context r0 = r12.getContext()
            if (r0 == 0) goto L_0x0167
            android.widget.TextView r0 = r12.A0E
            if (r0 == 0) goto L_0x01f5
            float r3 = r0.getRotation()
            android.widget.TextView r1 = r12.A0I
            java.lang.String r6 = "explosionView"
            if (r1 == 0) goto L_0x030e
            android.widget.TextView r0 = r12.A0E
            if (r0 == 0) goto L_0x01f5
            float r0 = r0.getX()
            r1.setX(r0)
            android.widget.TextView r1 = r12.A0I
            if (r1 == 0) goto L_0x030e
            android.widget.TextView r0 = r12.A0E
            if (r0 == 0) goto L_0x01f5
            float r0 = r0.getY()
            r1.setY(r0)
            android.widget.TextView r1 = r12.A0I
            if (r1 == 0) goto L_0x030e
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            android.widget.TextView r0 = r12.A0I
            if (r0 == 0) goto L_0x030e
            r0.setRotation(r3)
            android.widget.TextView r1 = r12.A0I
            if (r1 == 0) goto L_0x030e
            r0 = 0
            r1.setVisibility(r0)
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            android.animation.ValueAnimator r2 = X.AnonymousClass7TG.A0J(r2, r0)
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            r2.setInterpolator(r0)
            r1 = 1
            X.AJU r0 = new X.AJU
            r0.<init>(r12, r3, r1)
            A04(r0, r2, r12)
            r0 = 41
            X.C41655Ay7.A00(r2, r12, r0)
        L_0x0167:
            X.2S0 r2 = X.AnonymousClass2S0.A01
            r0 = 100
            r2.A05(r0)
            return
        L_0x016f:
            float r3 = r3 - r0
            android.widget.TextView r0 = r12.A0E
            if (r0 == 0) goto L_0x0273
            float r0 = X.AnonymousClass7TE.A02(r0)
            float r3 = r3 + r0
            goto L_0x00be
        L_0x017b:
            java.lang.String r0 = "💡"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01be
            java.util.List r3 = A0f
            int r0 = r12.A04
            int r0 = r0 / 5
            int r0 = X.AnonymousClass7TG.A0G(r3, r0)
            java.lang.Object r0 = r3.get(r0)
            int r0 = X.AnonymousClass7TE.A0M(r0)
            android.animation.ArgbEvaluator r5 = new android.animation.ArgbEvaluator
            r5.<init>()
            r7 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.0eM r0 = r12.A0e
            java.lang.Object r0 = r0.getValue()
            int r0 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0, r3}
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofObject(r5, r0)
            r5 = 200(0xc8, double:9.9E-322)
            android.animation.ValueAnimator r0 = X.AnonymousClass7TG.A0J(r0, r5)
            X.AJX.A00(r0, r12, r7)
        L_0x01be:
            r12.A03()
        L_0x01c1:
            android.widget.TextView r5 = r12.A0E
            if (r5 == 0) goto L_0x01f5
            float r3 = r12.A00
            int r0 = r5.getWidth()
            int r0 = r0 / 2
            float r0 = (float) r0
            float r3 = r3 - r0
            r5.setX(r3)
            android.widget.TextView r5 = r12.A0E
            if (r5 == 0) goto L_0x01f5
            float r3 = r12.A01
            int r0 = r5.getHeight()
            int r0 = r0 / 2
            float r0 = (float) r0
            float r3 = r3 - r0
            r5.setY(r3)
            android.widget.TextView r7 = r12.A0E
            if (r7 == 0) goto L_0x01f5
            float r6 = r7.getRotation()
            r5 = 1084227584(0x40a00000, float:5.0)
            java.util.Map r3 = A0i
            java.lang.String r0 = r12.A0S
            if (r0 != 0) goto L_0x045b
            java.lang.String r11 = "emoji"
        L_0x01f5:
            X.0qQ.A0F(r11)
            goto L_0x0276
        L_0x01f9:
            java.util.Map r3 = A0j
            java.lang.String r0 = r12.A0S
            if (r0 == 0) goto L_0x030e
            java.lang.Object r0 = r3.get(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r5.setText(r0)
        L_0x0208:
            android.content.Context r0 = r12.getContext()
            if (r0 == 0) goto L_0x0267
            java.lang.String r3 = r12.A0S
            java.lang.String r7 = "emoji"
            if (r3 == 0) goto L_0x0273
            java.lang.String r0 = "👻"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0224
            java.lang.String r0 = "🛸"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0267
        L_0x0224:
            X.0eM r5 = r12.A0Z
            java.lang.Object r0 = r5.getValue()
            java.util.Random r0 = (java.util.Random) r0
            boolean r0 = r0.nextBoolean()
            if (r0 == 0) goto L_0x0267
            r10 = 2
            float[] r0 = new float[r10]
            r0 = {1065353216, 0} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r7 = 500(0x1f4, double:2.47E-321)
            android.animation.ValueAnimator r3 = X.AnonymousClass7TG.A0J(r0, r7)
            r0 = 1
            X.AJX.A00(r3, r12, r0)
            float[] r0 = new float[r10]
            r0 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            android.animation.ValueAnimator r9 = X.AnonymousClass7TG.A0J(r0, r7)
            java.lang.Object r3 = r5.getValue()
            java.util.Random r3 = (java.util.Random) r3
            r0 = 2000(0x7d0, float:2.803E-42)
            int r0 = r3.nextInt(r0)
            long r5 = (long) r0
            long r5 = r5 + r7
            r9.setStartDelay(r5)
            X.AJX.A00(r9, r12, r10)
        L_0x0267:
            android.content.Context r0 = r12.getContext()
            if (r0 == 0) goto L_0x01be
            java.lang.String r3 = r12.A0S
            if (r3 != 0) goto L_0x017b
            java.lang.String r7 = "emoji"
        L_0x0273:
            X.0qQ.A0F(r7)
        L_0x0276:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x027b:
            float r3 = r12.A01
            android.widget.TextView r0 = r12.A0E
            if (r0 == 0) goto L_0x01f5
            float r0 = X.AnonymousClass7TE.A03(r0)
            float r3 = r3 + r0
            android.view.View r0 = r12.A06
            if (r0 == 0) goto L_0x030e
            float r0 = r0.getY()
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x01c1
            android.view.View r0 = r12.A06
            if (r0 == 0) goto L_0x030e
            float r8 = r0.getX()
            android.view.View r0 = r12.A06
            if (r0 == 0) goto L_0x030e
            float r7 = r0.getY()
            android.view.View r0 = r12.A06
            if (r0 == 0) goto L_0x030e
            float r5 = r0.getX()
            android.view.View r0 = r12.A06
            if (r0 == 0) goto L_0x030e
            float r0 = X.AnonymousClass7TE.A02(r0)
            float r5 = r5 + r0
            android.view.View r0 = r12.A06
            if (r0 == 0) goto L_0x030e
            float r3 = r0.getY()
            android.view.View r0 = r12.A06
            if (r0 == 0) goto L_0x030e
            float r0 = X.AnonymousClass7TE.A03(r0)
            float r3 = r3 + r0
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>(r8, r7, r5, r3)
            float r9 = r12.A00
            android.widget.TextView r0 = r12.A0E
            if (r0 == 0) goto L_0x01f5
            int r0 = r0.getWidth()
            int r0 = r0 / 2
            float r0 = (float) r0
            float r9 = r9 - r0
            float r8 = r12.A01
            android.widget.TextView r0 = r12.A0E
            if (r0 == 0) goto L_0x01f5
            int r0 = r0.getHeight()
            int r0 = r0 / 2
            float r0 = (float) r0
            float r8 = r8 - r0
            float r7 = r12.A00
            android.widget.TextView r0 = r12.A0E
            if (r0 == 0) goto L_0x01f5
            int r0 = r0.getWidth()
            int r0 = r0 / 2
            float r0 = (float) r0
            float r7 = r7 + r0
            float r3 = r12.A01
            android.widget.TextView r0 = r12.A0E
            if (r0 == 0) goto L_0x01f5
            int r0 = r0.getHeight()
            int r0 = r0 / 2
            float r0 = (float) r0
            float r3 = r3 + r0
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>(r9, r8, r7, r3)
            java.util.List r3 = A0k
            java.lang.String r0 = r12.A0S
            if (r0 != 0) goto L_0x0313
            java.lang.String r6 = "emoji"
        L_0x030e:
            X.0qQ.A0F(r6)
            goto L_0x0276
        L_0x0313:
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x01c1
            boolean r0 = android.graphics.RectF.intersects(r6, r5)
            if (r0 == 0) goto L_0x01c1
            float r3 = r12.A0U
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x01c1
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r3 * r0
            r12.A0U = r3
            int r0 = r12.A04
            int r0 = r0 + 1
            r12.A04 = r0
            android.widget.TextView r3 = r12.A0H
            if (r3 != 0) goto L_0x0337
            java.lang.String r6 = "currentScoreText"
            goto L_0x030e
        L_0x0337:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.setText(r0)
            X.2S0 r0 = X.AnonymousClass2S0.A01
            r0.A03()
            int r3 = r12.A04
            if (r3 <= 0) goto L_0x038c
            int r0 = r3 % 5
            if (r0 != 0) goto L_0x038c
            java.util.List r5 = A0f
            r0 = 1
            int r3 = r3 - r0
            int r0 = r3 / 5
            int r0 = X.AnonymousClass7TG.A0G(r5, r0)
            java.lang.Object r0 = r5.get(r0)
            int r3 = X.AnonymousClass7TE.A0M(r0)
            int r0 = r12.A04
            int r0 = r0 / 5
            int r0 = X.AnonymousClass7TG.A0G(r5, r0)
            java.lang.Object r0 = r5.get(r0)
            int r0 = X.AnonymousClass7TE.A0M(r0)
            android.animation.ArgbEvaluator r5 = new android.animation.ArgbEvaluator
            r5.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofObject(r5, r0)
            r5 = 500(0x1f4, double:2.47E-321)
            android.animation.ValueAnimator r3 = X.AnonymousClass7TG.A0J(r0, r5)
            r0 = 5
            X.AJX.A00(r3, r12, r0)
        L_0x038c:
            android.widget.TextView r0 = r12.A0P
            java.lang.String r6 = "projectileView"
            r10 = r6
            if (r0 == 0) goto L_0x030e
            java.lang.CharSequence r0 = r0.getText()
            r9 = 0
            if (r0 == 0) goto L_0x0410
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x0410
            android.widget.TextView r5 = r12.A0P
            if (r5 == 0) goto L_0x030e
            float r3 = r12.A00
            int r0 = r5.getWidth()
            r8 = 2
            int r0 = r0 / r8
            float r0 = (float) r0
            float r3 = r3 - r0
            r5.setX(r3)
            android.widget.TextView r5 = r12.A0P
            if (r5 == 0) goto L_0x030e
            float r3 = r12.A01
            int r0 = r5.getHeight()
            int r0 = r0 / r8
            float r0 = (float) r0
            float r3 = r3 - r0
            r5.setY(r3)
            android.widget.TextView r3 = r12.A0P
            if (r3 == 0) goto L_0x030e
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.setAlpha(r0)
            android.widget.TextView r0 = r12.A0P
            if (r0 == 0) goto L_0x030e
            r0.setVisibility(r9)
            float r7 = r12.A02
            float[] r0 = new float[r8]
            r0 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r5 = 1000(0x3e8, double:4.94E-321)
            android.animation.ValueAnimator r3 = X.AnonymousClass7TG.A0J(r0, r5)
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            r3.setInterpolator(r0)
            X.AJU r0 = new X.AJU
            r0.<init>(r12, r7, r9)
            A04(r0, r3, r12)
            r0 = 38
            X.C41655Ay7.A00(r3, r12, r0)
            float[] r0 = new float[r8]
            r0 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            android.animation.ValueAnimator r3 = X.AnonymousClass7TG.A0J(r0, r5)
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            r3.setInterpolator(r0)
            r0 = 4
            X.AJX.A00(r3, r12, r0)
        L_0x0410:
            android.content.Context r0 = r12.getContext()
            if (r0 == 0) goto L_0x0208
            java.util.Map r3 = A0h
            java.lang.String r0 = r12.A0S
            java.lang.String r6 = "emoji"
            if (r0 == 0) goto L_0x030e
            java.lang.Object r5 = r3.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x0208
            X.0eM r0 = r12.A0Z
            java.lang.Object r0 = r0.getValue()
            java.util.Random r0 = (java.util.Random) r0
            float r3 = r0.nextFloat()
            r0 = 1036831949(0x3dcccccd, float:0.1)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0208
            r12.A0S = r5
            android.widget.TextView r0 = r12.A0E
            if (r0 != 0) goto L_0x0442
            r6 = r11
            goto L_0x030e
        L_0x0442:
            r0.setText(r5)
            android.widget.TextView r3 = r12.A0I
            if (r3 != 0) goto L_0x044d
            java.lang.String r6 = "explosionView"
            goto L_0x030e
        L_0x044d:
            java.lang.String r0 = r12.A0S
            if (r0 == 0) goto L_0x030e
            r3.setText(r0)
            android.widget.TextView r5 = r12.A0P
            if (r5 != 0) goto L_0x01f9
            r6 = r10
            goto L_0x030e
        L_0x045b:
            java.lang.Object r0 = r3.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x047c
            float r0 = r0.floatValue()
        L_0x0467:
            float r5 = r5 * r0
            int r0 = r12.A04
            float r3 = (float) r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r0
            float r5 = r5 + r3
            int r0 = (int) r5
            float r0 = (float) r0
            float r6 = r6 + r0
            r7.setRotation(r6)
            X.AkZ r0 = new X.AkZ
            r0.<init>(r12)
            goto L_0x0015
        L_0x047c:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0467
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C384879i2.A05(X.9i2):void");
    }

    public static final void A06(C384879i2 r9) {
        View view;
        Drawable drawable;
        if (r9.getContext() != null && (view = r9.mView) != null) {
            r9.A04 = 0;
            TextView textView = r9.A0H;
            String str = "currentScoreText";
            if (textView != null) {
                textView.setText(String.valueOf(0));
                TextView textView2 = r9.A0H;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                    AnonymousClass0eM r5 = r9.A0Z;
                    float f = 1.0f;
                    float nextFloat = ((((Random) r5.getValue()).nextFloat() * 0.5f) + 1.0f) - 0.25f;
                    if (!((Random) r5.getValue()).nextBoolean()) {
                        f = -1.0f;
                    }
                    r9.A02 = nextFloat * f;
                    r9.A0U = ((((Random) r5.getValue()).nextFloat() * 0.5f) - 4.0f) - 0.25f;
                    r9.A00 = ((AnonymousClass7TE.A02(view) / 2.0f) + ((float) ((Random) r5.getValue()).nextInt(10))) - 5.0f;
                    r9.A01 = ((AnonymousClass7TE.A03(view) / 2.0f) + ((float) ((Random) r5.getValue()).nextInt(10))) - 5.0f;
                    TextView textView3 = r9.A0E;
                    if (textView3 == null) {
                        str = "ballView";
                    } else {
                        textView3.setVisibility(0);
                        View view2 = r9.A06;
                        if (view2 == null) {
                            str = "paddleView";
                        } else {
                            view2.setVisibility(0);
                            View view3 = r9.A07;
                            if (view3 == null) {
                                str = "restartButton";
                            } else {
                                view3.setVisibility(8);
                                TextView textView4 = r9.A0J;
                                if (textView4 == null) {
                                    str = "finalScoreText";
                                } else {
                                    textView4.setVisibility(8);
                                    TextView textView5 = r9.A0O;
                                    if (textView5 == null) {
                                        str = "newHighScoreText";
                                    } else {
                                        textView5.setVisibility(8);
                                        FrameLayout frameLayout = r9.A09;
                                        if (frameLayout == null) {
                                            str = "emojiShowerContainer";
                                        } else {
                                            frameLayout.removeAllViews();
                                            int A0M2 = AnonymousClass7TE.A0M(A0f.get(0));
                                            View view4 = r9.mView;
                                            if (view4 != null) {
                                                view4.setBackgroundColor(A0M2);
                                            }
                                            ImageView imageView = r9.A0A;
                                            if (imageView == null) {
                                                str = "dismissButton";
                                            } else {
                                                Drawable drawable2 = imageView.getDrawable();
                                                AnonymousClass0eM r2 = r9.A0V;
                                                drawable2.setTint(AnonymousClass7TE.A0M(r2.getValue()));
                                                AnonymousClass7TH.A0T(r9.A0L, r2);
                                                AnonymousClass7TH.A0T(r9.A0Q, r2);
                                                AnonymousClass7TH.A0T(r9.A0R, r2);
                                                ImageView imageView2 = r9.A0B;
                                                if (!(imageView2 == null || (drawable = imageView2.getDrawable()) == null)) {
                                                    drawable.setTint(AnonymousClass7TE.A0M(r2.getValue()));
                                                }
                                                TextView textView6 = r9.A0M;
                                                if (textView6 != null) {
                                                    textView6.setVisibility(0);
                                                }
                                                TextView textView7 = r9.A0N;
                                                if (textView7 != null) {
                                                    textView7.setVisibility(8);
                                                }
                                                A07(r9, true);
                                                View view5 = r9.mView;
                                                if (view5 != null) {
                                                    ValueAnimator A0J2 = AnonymousClass7TG.A0J(ValueAnimator.ofFloat(new float[]{AnonymousClass7TE.A02(view5) / 4.0f, AnonymousClass7TE.A02(view5) / 2.0f}), 500);
                                                    A0J2.setInterpolator(new OvershootInterpolator());
                                                    AJX.A00(A0J2, r9, 6);
                                                }
                                                AnonymousClass2S0.A01.A05(100);
                                                view.postDelayed(new C40866Aka(r9), 16);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A07(C384879i2 r2, boolean z) {
        Window window;
        FragmentActivity activity = r2.getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            04l r0 = new C586704n(window.getDecorView(), window).A00;
            r0.A05(z);
            r0.A04(z);
        }
    }

    public final void onCreate(Bundle bundle) {
        String string;
        int A022 = AnonymousClass0fD.A02(-625233850);
        C384879i2.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        String str = "❤️";
        if (!(bundle2 == null || (string = bundle2.getString(C66579MXk.A00(772), str)) == null)) {
            str = string;
        }
        this.A0S = str;
        AnonymousClass0fD.A09(1106930902, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1465271670);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_emoji_pong, viewGroup, false);
        AnonymousClass0fD.A09(-1592191998, A022);
        return inflate;
    }
}
