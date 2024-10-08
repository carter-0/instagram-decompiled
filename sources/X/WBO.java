package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.reels.interactive.view.AvatarView;
import com.instagram.user.model.User;

public final class WBO implements View.OnFocusChangeListener, AnonymousClass8Z3 {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public EditText A05;
    public ImageView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public CircularImageView A0B;
    public C252063oV A0C;
    public AvatarView A0D;
    public C16306UsZ A0E;
    public User A0F;
    public Integer A0G;
    public boolean A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public String A0L;
    public int[] A0M = new int[2];
    public final Context A0N;
    public final View A0O;
    public final ViewStub A0P;
    public final UserSession A0Q;
    public final AnonymousClass8ME A0R;
    public final AnonymousClass87F A0S;
    public final Rect A0T = new Rect();
    public final AnonymousClass80U A0U;

    public WBO(View view, UserSession userSession, AnonymousClass3E6 r6, AnonymousClass80U r7, AnonymousClass8ME r8) {
        this.A0Q = userSession;
        this.A0U = r7;
        this.A0R = r8;
        Context A0S2 = AnonymousClass7TE.A0S(view);
        this.A0N = A0S2;
        this.A0S = new AnonymousClass87F(A0S2, r6, this);
        this.A0O = AnonymousClass7TE.A0b(view, R.id.text_overlay_edit_text_container);
        this.A0P = (ViewStub) AnonymousClass7TE.A0b(view, R.id.smb_support_sticker_editor_stub);
    }

    public final void onFocusChange(View view, boolean z) {
        0qQ.A0B(view, 0);
        if (z) {
            this.A0S.A00();
            C63183Ksq.A00(view);
            return;
        }
        EditText editText = this.A05;
        if (editText == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (!editText.hasFocus()) {
            TextView textView = this.A07;
            if (textView == null) {
                throw new IllegalStateException("Required value was null.");
            } else if (!textView.hasFocus()) {
                this.A0S.A01();
                0nA.A0N(view);
                A01();
            }
        }
    }

    public static final C18603Vuw A00(WBO wbo) {
        WBO wbo2 = wbo;
        EditText editText = wbo2.A05;
        if (editText != null) {
            String A0f = AnonymousClass7TF.A0f(editText);
            int length = A0f.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                int i2 = length;
                if (!z) {
                    i2 = i;
                }
                boolean A13 = Dbc.A13(A0f, i2);
                if (z) {
                    if (!A13) {
                        break;
                    }
                    length--;
                } else if (!A13) {
                    z = true;
                } else {
                    i++;
                }
            }
            String A0c = Dba.A0c(A0f, length, i);
            if (A0c == null || A0c.length() == 0) {
                A0c = wbo2.A0L;
            }
            int i3 = wbo2.A0I;
            int[] iArr = wbo2.A0M;
            Integer valueOf = Integer.valueOf(iArr[0]);
            Integer valueOf2 = Integer.valueOf(iArr[1]);
            C14272Tsv tsv = C14272Tsv.SOLID_LIGHT_GREY;
            if (C14276Tsz.A01(tsv, valueOf, valueOf2) == C18603Vuw.A03) {
                i3 = -13068304;
            }
            User user = wbo2.A0F;
            if (user != null) {
                Integer num = wbo2.A0G;
                if (num != null) {
                    C14272Tsv tsv2 = C14272Tsv.GRADIENT_PURPLE_BLUE;
                    if (num == AnonymousClass05K.A01) {
                        tsv2 = C14272Tsv.GRADIENT_RED_YELLOW;
                    }
                    if (num == AnonymousClass05K.A0C) {
                        tsv2 = tsv;
                    }
                    C14276Tsz.A02(tsv2);
                    if (A0c != null) {
                        int i4 = wbo2.A0J;
                        int[] iArr2 = wbo2.A0M;
                        int i5 = iArr2[0];
                        int i6 = iArr2[1];
                        int i7 = wbo2.A0K;
                        int i8 = wbo2.A01;
                        User user2 = wbo2.A0F;
                        if (user2 != null) {
                            Integer num2 = wbo2.A0G;
                            if (num2 != null) {
                                String A012 = F7G.A01(user2, num2);
                                Context context = wbo2.A0N;
                                Integer num3 = wbo2.A0G;
                                if (num3 != null) {
                                    return new C18603Vuw(user, num, F7G.A00(context, num3), A012, A0c, i3, i6, i8, i5, i4, i7, wbo2.A0H);
                                }
                                throw new IllegalStateException("Required value was null.");
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A01() {
        View view;
        if (this.A04 != null) {
            C315596kB.A08(new View[]{this.A0O, this.A03}, false);
            C16306UsZ usZ = this.A0E;
            if (usZ != null) {
                usZ.A01("");
                EditText editText = this.A05;
                if (editText != null) {
                    if (editText.hasFocus()) {
                        view = this.A05;
                        if (view == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        TextView textView = this.A07;
                        if (textView == null) {
                            throw new IllegalStateException("Required value was null.");
                        } else if (textView.hasFocus()) {
                            view = this.A07;
                            if (view == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            return;
                        }
                    }
                    view.clearFocus();
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r2v11, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public static final void A02(WBO wbo, C14272Tsv tsv) {
        C14272Tsv tsv2;
        if (tsv == C18603Vuw.A02) {
            wbo.A0K = -16777216;
            wbo.A0J = -6710887;
            wbo.A0I = -1;
            C252063oV r0 = wbo.A0C;
            if (r0 != null) {
                r0.setVisibility(8);
                TextView textView = wbo.A07;
                if (textView != null) {
                    DbU.A11(wbo.A0N, textView, R.drawable.fundraiser_white_sticker_donate_button_background);
                    tsv2 = C14272Tsv.SOLID_BLUE;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            wbo.A0K = -1;
            wbo.A0J = -855638017;
            wbo.A0I = C14276Tsz.A00(tsv);
            C252063oV r02 = wbo.A0C;
            if (r02 != null) {
                r02.setVisibility(8);
                TextView textView2 = wbo.A07;
                if (textView2 != null) {
                    DbU.A11(wbo.A0N, textView2, R.drawable.smb_support_sticker_cta_background);
                    tsv2 = tsv;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        wbo.A0M = C14276Tsz.A02(tsv);
        View view = wbo.A02;
        if (view != null) {
            Drawable mutate = view.getBackground().mutate();
            String A002 = C273654mx.A00(0);
            0qQ.A0C(mutate, A002);
            ((GradientDrawable) mutate).setColors(wbo.A0M);
            ? r03 = wbo.A0B;
            if (r03 != 0) {
                Drawable mutate2 = r03.getBackground().mutate();
                0qQ.A0C(mutate2, A002);
                ((GradientDrawable) mutate2).setColors(C14276Tsz.A02(tsv2));
                EditText editText = wbo.A05;
                if (editText != null) {
                    editText.setTextColor(wbo.A0K);
                    EditText editText2 = wbo.A05;
                    if (editText2 != null) {
                        editText2.setHintTextColor(0nH.A07(wbo.A0K, 0.6f));
                        TextView textView3 = wbo.A0A;
                        if (textView3 != null) {
                            textView3.setTextColor(wbo.A0J);
                            TextView textView4 = wbo.A07;
                            if (textView4 != null) {
                                textView4.setTextColor(wbo.A0I);
                                ImageView imageView = wbo.A06;
                                if (imageView != null) {
                                    imageView.setColorFilter(AnonymousClass37O.A00(C14276Tsz.A00(tsv)));
                                    ? r2 = wbo.A0B;
                                    if (r2 != 0) {
                                        r2.setColorFilter(AnonymousClass37O.A00(-1));
                                        return;
                                    }
                                    throw new IllegalStateException("Required value was null.");
                                }
                                throw new IllegalStateException("Required value was null.");
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.8TZ, java.lang.Object] */
    public final void A04(boolean z) {
        C317876nz r0;
        AnonymousClass8ME r3 = this.A0R;
        C18603Vuw A002 = A00(this);
        if (!z) {
            C16147UpY upY = new C16147UpY(r3.A0f);
            upY.A0B(A002);
            C39890ADo A16 = r3.A16();
            if (AnonymousClass05K.A00 == A002.A01()) {
                upY.A01 = "smb_support_sticker_gift_card";
                r0 = C317876nz.A1R;
            } else if (AnonymousClass05K.A01 == A002.A01()) {
                upY.A01 = "smb_support_sticker_food_delivery";
                r0 = C317876nz.A1P;
            } else if (AnonymousClass05K.A0C == A002.A01()) {
                upY.A01 = "smb_support_sticker_get_quote";
                r0 = C317876nz.A1Q;
            }
            r3.A1K(upY, new C310416b1(A16), r0.A01());
        } else {
            AnonymousClass80U r2 = r3.A1B;
            ? obj = new Object();
            obj.A00 = false;
            r2.E3H(obj);
            AnonymousClass8ME.A0Z(r3, C16147UpY.class);
        }
        r3.A1N(AnonymousClass05K.A01);
        r3.A0z.Dn9(C317876nz.A1P.A0Z);
        EditText editText = this.A05;
        if (editText != null) {
            editText.removeTextChangedListener(this.A0E);
            A01();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void DMp() {
        this.A0U.E3H(new Object());
    }

    public final void DzC(int i, int i2) {
        if (this.A0G == AnonymousClass05K.A0C) {
            View view = this.A0O;
            Rect rect = this.A0T;
            view.getGlobalVisibleRect(rect);
            TextView textView = this.A09;
            if (textView != null) {
                textView.setTranslationY((float) (i2 - rect.bottom));
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    /* JADX WARNING: type inference failed for: r2v31, types: [android.widget.ImageView] */
    /* JADX WARNING: type inference failed for: r2v40 */
    /* JADX WARNING: type inference failed for: r2v41 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01c6  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.WBO r10, X.C18603Vuw r11) {
        /*
            com.instagram.user.model.User r2 = r11.A00()
            java.lang.String r1 = "Required value was null."
            if (r2 == 0) goto L_0x02e3
            r10.A0F = r2
            com.instagram.reels.interactive.view.AvatarView r0 = r10.A0D
            if (r0 == 0) goto L_0x02dd
            r0.setAvatarUser(r2)
            com.instagram.reels.interactive.view.AvatarView r2 = r10.A0D
            if (r2 == 0) goto L_0x02d7
            android.content.Context r3 = r10.A0N
            int r0 = X.AnonymousClass7TG.A04(r3)
            r2.setStrokeWidth(r0)
            com.instagram.reels.interactive.view.AvatarView r2 = r10.A0D
            if (r2 == 0) goto L_0x02d1
            r8 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r0 = r3.getColor(r8)
            r2.setStrokeColor(r0)
            com.instagram.user.model.User r4 = r10.A0F
            if (r4 == 0) goto L_0x02cb
            java.lang.Integer r2 = r11.A01()
            if (r2 == 0) goto L_0x02c5
            r5 = 0
            r9 = 1
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            if (r2 != r7) goto L_0x0216
            r2 = 2131974053(0x7f1357a5, float:1.958516E38)
        L_0x003f:
            java.lang.String r0 = r4.getUsername()
            java.lang.String r2 = X.DbY.A0c(r3, r0, r2)
        L_0x0047:
            r10.A0L = r2
            java.lang.Integer r0 = r10.A0G
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
            boolean r0 = X.AnonymousClass7TF.A1W(r0, r4)
            X.UsZ r6 = r10.A0E
            if (r0 == 0) goto L_0x01f7
            if (r6 == 0) goto L_0x02b3
            com.instagram.api.schemas.SMBSupportStickerDict r0 = r11.A00
            java.lang.String r2 = r0.A0D
            if (r2 == 0) goto L_0x0063
            int r0 = r2.length()
            if (r0 != 0) goto L_0x0065
        L_0x0063:
            java.lang.String r2 = ""
        L_0x0065:
            r6.A01(r2)
            android.widget.EditText r0 = r10.A05
            if (r0 == 0) goto L_0x02ad
            X.JTR.A1F(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r6 = r10.A0B
            if (r6 == 0) goto L_0x02a7
            int r2 = X.AnonymousClass7TG.A03(r3)
            int r0 = r3.getColor(r8)
            r6.A0H(r2, r0)
            java.lang.Integer r0 = r11.A01()
            if (r0 != r7) goto L_0x01cf
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r10.A0B
            if (r2 == 0) goto L_0x028f
            r0 = 2131238327(0x7f081db7, float:1.809293E38)
        L_0x008b:
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
        L_0x008f:
            r2.setImageDrawable(r0)
        L_0x0092:
            boolean r0 = r11.A01
            r10.A0H = r0
            java.lang.Integer r0 = r10.A0G
            boolean r0 = X.AnonymousClass7TF.A1W(r0, r4)
            android.widget.TextView r2 = r10.A08
            if (r0 == 0) goto L_0x01c6
            if (r2 == 0) goto L_0x0283
            r2.setVisibility(r5)
            r0 = 2131964862(0x7f1333be, float:1.9566518E38)
            java.lang.String r6 = X.AnonymousClass7TE.A16(r3, r0)
            r0 = 2131964861(0x7f1333bd, float:1.9566516E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r3, r0)
            android.text.SpannableStringBuilder r5 = X.W3L.A01(r3, r0)
            android.widget.TextView r2 = r10.A08
            if (r2 == 0) goto L_0x027d
            boolean r0 = r10.A0H
            if (r0 != 0) goto L_0x00c0
            r6 = r5
        L_0x00c0:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r2.setText(r6)
        L_0x00c5:
            java.lang.Integer r0 = r10.A0G
            boolean r0 = X.AnonymousClass7TF.A1W(r0, r4)
            android.widget.TextView r2 = r10.A09
            if (r0 == 0) goto L_0x01bd
            if (r2 == 0) goto L_0x0271
            r0 = 0
            r2.setVisibility(r0)
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.Object r7 = X.0mE.A00(r3, r0)
            android.app.Activity r7 = (android.app.Activity) r7
            android.widget.TextView r6 = r10.A09
            if (r6 == 0) goto L_0x026b
            com.instagram.common.session.UserSession r5 = r10.A0Q
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r5)
            X.4Cl r0 = r0.A03
            java.lang.Boolean r0 = r0.CS2()
            boolean r0 = X.AnonymousClass7TG.A1X(r0)
            r2 = 2131964864(0x7f1333c0, float:1.9566522E38)
            if (r0 == 0) goto L_0x00f9
            r2 = 2131964865(0x7f1333c1, float:1.9566524E38)
        L_0x00f9:
            int r0 = X.2Yu.A0D(r3)
            android.text.SpannableStringBuilder r0 = X.W3L.A00(r7, r3, r5, r2, r0)
            r6.setText(r0)
            android.widget.TextView r0 = r10.A09
            if (r0 == 0) goto L_0x0265
            X.DbT.A1H(r0)
        L_0x010b:
            java.lang.Integer r0 = r10.A0G
            if (r0 != r4) goto L_0x017f
            android.widget.TextView r2 = r10.A0A
            if (r2 == 0) goto L_0x0241
            r0 = 8
            r2.setVisibility(r0)
            android.widget.EditText r0 = r10.A05
            if (r0 == 0) goto L_0x023b
            android.view.ViewGroup$MarginLayoutParams r7 = X.DbX.A0G(r0)
            int r6 = r7.leftMargin
            int r5 = r7.topMargin
            int r2 = r7.rightMargin
            int r0 = X.C51972G9s.A08(r3)
            r7.setMargins(r6, r5, r2, r0)
            android.widget.EditText r0 = r10.A05
            if (r0 == 0) goto L_0x0235
            r0.setLayoutParams(r7)
        L_0x0134:
            android.widget.TextView r2 = r10.A07
            if (r2 == 0) goto L_0x022f
            java.lang.Integer r0 = r11.A01()
            if (r0 == 0) goto L_0x0229
            java.lang.String r0 = X.F7G.A00(r3, r0)
            r2.setText(r0)
            com.instagram.api.schemas.SMBSupportStickerDict r0 = r11.A00
            java.lang.String r2 = r0.A0B
            int[] r5 = X.C18603Vuw.A04
            r0 = 0
            r0 = r5[r0]
            int r0 = X.0nH.A0C(r2, r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            com.instagram.api.schemas.SMBSupportStickerDict r0 = r11.A00
            java.lang.String r2 = r0.A08
            r0 = r5[r9]
            int r0 = X.0nH.A0C(r2, r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.Tsv r0 = X.C14272Tsv.SOLID_LIGHT_GREY
            X.Tsv r2 = X.C14276Tsz.A01(r0, r3, r2)
            if (r2 == 0) goto L_0x0223
            java.lang.Integer r0 = r10.A0G
            if (r0 != r4) goto L_0x017c
            java.util.ArrayList r0 = X.C17164VKt.A01
        L_0x0172:
            int r0 = r0.indexOf(r2)
            r10.A00 = r0
            A02(r10, r2)
            return
        L_0x017c:
            java.util.ArrayList r0 = X.C17164VKt.A06
            goto L_0x0172
        L_0x017f:
            android.widget.TextView r2 = r10.A09
            if (r2 == 0) goto L_0x025f
            r0 = 0
            r2.setVisibility(r0)
            android.widget.TextView r5 = r10.A0A
            if (r5 == 0) goto L_0x0259
            com.instagram.user.model.User r2 = r10.A0F
            if (r2 == 0) goto L_0x0253
            java.lang.Integer r0 = r10.A0G
            if (r0 == 0) goto L_0x024d
            java.lang.String r2 = X.F7G.A01(r2, r0)
            if (r2 == 0) goto L_0x01ba
            int r0 = r2.length()
            if (r0 == 0) goto L_0x01ba
            r0 = 2131974054(0x7f1357a6, float:1.9585161E38)
            java.lang.String r0 = X.DbW.A0h(r3, r2, r0)
            X.0qQ.A0A(r0)
        L_0x01a9:
            r5.setText(r0)
            android.widget.TextView r2 = r10.A0A
            if (r2 == 0) goto L_0x0247
            X.WjV r0 = new X.WjV
            r0.<init>(r10)
            r2.post(r0)
            goto L_0x0134
        L_0x01ba:
            java.lang.String r0 = ""
            goto L_0x01a9
        L_0x01bd:
            if (r2 == 0) goto L_0x0277
            r0 = 8
            r2.setVisibility(r0)
            goto L_0x010b
        L_0x01c6:
            if (r2 == 0) goto L_0x0289
            r0 = 8
            r2.setVisibility(r0)
            goto L_0x00c5
        L_0x01cf:
            java.lang.Integer r2 = r11.A01()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r2 != r0) goto L_0x01ea
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r10.A0B
            if (r2 == 0) goto L_0x029b
            r0 = 2131238930(0x7f082012, float:1.8094153E38)
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
            if (r0 == 0) goto L_0x0295
            android.graphics.drawable.Drawable r0 = r0.mutate()
            goto L_0x008f
        L_0x01ea:
            java.lang.Integer r0 = r10.A0G
            if (r0 != r4) goto L_0x0092
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r10.A0B
            if (r2 == 0) goto L_0x02a1
            r0 = 2131238129(0x7f081cf1, float:1.8092528E38)
            goto L_0x008b
        L_0x01f7:
            if (r6 == 0) goto L_0x02bf
            r6.A00(r2)
            X.UsZ r6 = r10.A0E
            if (r6 == 0) goto L_0x02b9
            com.instagram.api.schemas.SMBSupportStickerDict r0 = r11.A00
            java.lang.String r2 = r0.A0D
            if (r2 == 0) goto L_0x020c
            int r0 = r2.length()
            if (r0 != 0) goto L_0x0065
        L_0x020c:
            java.lang.String r2 = r10.A0L
            if (r2 != 0) goto L_0x0065
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0216:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r2 != r0) goto L_0x021f
            r2 = 2131974052(0x7f1357a4, float:1.9585157E38)
            goto L_0x003f
        L_0x021f:
            java.lang.String r2 = ""
            goto L_0x0047
        L_0x0223:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0229:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x022f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0235:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x023b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0241:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0247:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x024d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0253:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0259:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x025f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0265:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x026b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0271:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0277:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x027d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0283:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0289:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x028f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0295:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x029b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02a1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02a7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02ad:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02b3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02b9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02bf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02c5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02cb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02d1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02d7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02dd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02e3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WBO.A03(X.WBO, X.Vuw):void");
    }
}
