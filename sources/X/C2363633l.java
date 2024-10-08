package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.android.R;
import com.instagram.api.schemas.ConfirmationStyle;
import com.instagram.api.schemas.ConfirmationTitleStyle;
import com.instagram.api.schemas.MediaOptionStyle;
import com.instagram.api.schemas.UndoStyle;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.33l  reason: invalid class name and case insensitive filesystem */
public final class C2363633l {
    public static String A02 = "v1";
    public static final C2363733m A03 = new Object();
    public final C2363233h A00;
    public final boolean A01;

    public C2363633l(C2363233h r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = false;
    }

    public final void A00(View view, C61079JwH jwH, UserSession userSession, AnonymousClass1Xn r27, Object obj) {
        Throwable th;
        int i;
        int i2;
        1Xj r14;
        AnonymousClass1Xn r8 = r27;
        Object obj2 = obj;
        int A032 = AnonymousClass0fD.A03(-2022732367);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        View view2 = view;
        view2.setTag(R.id.row_tombstone_item, r8);
        C53157GjT gjT = (C53157GjT) view2.getTag();
        if (gjT != null) {
            C2363733m r12 = A03;
            View view3 = gjT.A06;
            view3.setOnClickListener((View.OnClickListener) null);
            view3.setVisibility(8);
            C56310HwN.A00(gjT);
            TextView textView = gjT.A0H;
            textView.setVisibility(8);
            gjT.itemView.setVisibility(0);
            if (r8 instanceof DHL) {
                0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.feed.ui.state.MediaState");
                AnonymousClass3W1 r7 = (AnonymousClass3W1) obj2;
                C2363733m.A08(gjT, false);
                textView.setText(2131975455);
                if (r7.A0m != AnonymousClass3WA.AD4AD) {
                    gjT.A00();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(HM4.NOT_RELEVANT, 2131975444);
                    linkedHashMap.put(HM4.SEE_TOO_OFTEN, 2131975465);
                    linkedHashMap.put(HM4.INAPPROPRIATE, 2131975466);
                    ArrayList arrayList = new ArrayList(linkedHashMap.keySet());
                    gjT.A02(arrayList.size());
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        int indexOf = arrayList.indexOf(next);
                        ArrayList arrayList2 = gjT.A0J;
                        View requireViewById = ((View) arrayList2.get(indexOf)).requireViewById(R.id.survey_tombstone_reason_text);
                        0qQ.A07(requireViewById);
                        TextView textView2 = (TextView) requireViewById;
                        Object obj3 = linkedHashMap.get(next);
                        if (obj3 != null) {
                            textView2.setText(((Number) obj3).intValue());
                            AnonymousClass0fU.A00(new C56742IAr(gjT, r7), (View) arrayList2.get(indexOf));
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    C2363733m.A07(gjT, 8);
                }
                gjT.A01();
            } else {
                C61079JwH jwH2 = jwH;
                if (jwH != null && (r14 = (1Xj) jwH2.A01) != null) {
                    0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.feed.ui.state.MediaState");
                    AnonymousClass3W1 r72 = (AnonymousClass3W1) obj2;
                    AnonymousClass3W1 r0 = gjT.A03;
                    if (!(r0 == null || r0 == r72)) {
                        r0.A0M(gjT, (Integer) null, false);
                    }
                    gjT.A01 = r14;
                    gjT.A03 = r72;
                    gjT.A02 = this.A00;
                    gjT.A04 = this.A01;
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    Object systemService = view2.getContext().getSystemService("window");
                    if (systemService != null) {
                        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
                        if (gjT.A04) {
                            View view4 = gjT.A07;
                            ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
                            layoutParams.width = -1;
                            layoutParams.height = -1;
                            view4.setLayoutParams(layoutParams);
                            View view5 = gjT.A0B;
                            ViewGroup.LayoutParams layoutParams2 = view5.getLayoutParams();
                            layoutParams2.width = -1;
                            layoutParams2.height = -1;
                            view5.setLayoutParams(layoutParams2);
                            gjT.A0D.setPadding(0, (int) (((double) displayMetrics.heightPixels) * 0.27d), 0, 0);
                            gjT.A0E.setPadding(0, 0, 0, (int) (((double) displayMetrics.heightPixels) * 0.27d));
                        }
                        int i3 = gjT.A05;
                        if (i3 == 0) {
                            r12.A09(jwH2, userSession2, gjT, r72);
                        } else if (i3 == 1) {
                            C2363733m.A08(gjT, true);
                            TextView textView3 = gjT.A0F;
                            Context context = textView3.getContext();
                            JM8 jm8 = (JM8) ((GTI) jwH2.A00).A06;
                            if (!(jm8 instanceof IUJ)) {
                                if (jm8 instanceof IUI) {
                                    IUI iui = (IUI) jm8;
                                    String string = context.getString(iui.A01);
                                    String string2 = context.getString(iui.A00);
                                    gjT.A08.setVisibility(8);
                                    gjT.A0B.setVisibility(0);
                                    gjT.A0D.setVisibility(8);
                                    Resources resources = context.getResources();
                                    textView3.setText(string);
                                    0nA.A0c(textView3, resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size) + textView3.getPaint().getFontMetricsInt().top);
                                    TextView textView4 = gjT.A0E;
                                    textView4.setText(string2);
                                    0nA.A0X(textView4, resources.getDimensionPixelSize(R.dimen.ai_sticker_creation_suggested_prompt_pill_height) - textView4.getPaint().getFontMetricsInt().bottom);
                                } else if (jm8 instanceof IUH) {
                                    gjT.A00();
                                    List list = ((IUH) jm8).A00;
                                    gjT.A02(list.size());
                                    int size = list.size();
                                    for (int i4 = 0; i4 < size; i4++) {
                                        ArrayList arrayList3 = gjT.A0J;
                                        View requireViewById2 = ((View) arrayList3.get(i4)).requireViewById(R.id.survey_tombstone_reason_text);
                                        0qQ.A07(requireViewById2);
                                        ((TextView) requireViewById2).setText((CharSequence) list.get(i4));
                                        AnonymousClass0fU.A00(new C56772IBv(jwH2, gjT, jm8, i4), (View) arrayList3.get(i4));
                                    }
                                    C2363733m.A07(gjT, 8);
                                } else {
                                    throw new RuntimeException();
                                }
                            }
                            gjT.A01();
                        } else {
                            th = new UnsupportedOperationException("Unsupported tombstone type");
                            i = 289373657;
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else if (r8 instanceof WWP) {
                    WWP wwp = (WWP) r8;
                    0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.feed.ui.state.FeedSurveyState");
                    C57251IUm iUm = (C57251IUm) obj2;
                    C2363733m.A08(gjT, false);
                    if (iUm.A01 != AnonymousClass05K.A00) {
                        gjT.A00();
                        0sn r9 = wwp.A01.A0A;
                        if (r9 == null) {
                            r9 = 0sn.A00;
                        }
                        gjT.A02(r9.size());
                        int size2 = r9.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            ArrayList arrayList4 = gjT.A0J;
                            View requireViewById3 = ((View) arrayList4.get(i5)).requireViewById(R.id.survey_tombstone_reason_text);
                            0qQ.A07(requireViewById3);
                            ((TextView) requireViewById3).setText(((C250273lB) r9.get(i5)).getText());
                            AnonymousClass0fU.A00(new ICI(wwp, this, gjT, iUm, i5), (View) arrayList4.get(i5));
                        }
                        C2363733m.A07(gjT, 8);
                    }
                    gjT.A01();
                } else if (r8 instanceof C270054g7) {
                    int i6 = gjT.A05;
                    C2363733m.A07(gjT, 8);
                    C56310HwN.A01(gjT, 8);
                    TextView textView5 = gjT.A0F;
                    if (i6 == 3) {
                        textView5.setText(2131975454);
                        textView5.getPaint().setFakeBoldText(true);
                    } else {
                        textView5.setText(2131975467);
                        textView5.getPaint().setFakeBoldText(true);
                        TextView textView6 = gjT.A0E;
                        textView6.setVisibility(0);
                        textView6.setText(2131973899);
                    }
                    gjT.A0B.setVisibility(0);
                } else if (r8 instanceof AnonymousClass5j1) {
                    AnonymousClass5j1 r82 = (AnonymousClass5j1) r8;
                    0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.feed.ui.state.BusinessConversionNetegoState");
                    C57249IUk iUk = (C57249IUk) obj2;
                    C2363733m.A08(gjT, false);
                    if (iUk.A00 == C266954ac.FINISHED) {
                        gjT.A01();
                    }
                    gjT.A00();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put(C266954ac.NO_TIME, 2131968426);
                    linkedHashMap2.put(C266954ac.NOT_BUSINESS, 2131968501);
                    ArrayList arrayList5 = new ArrayList(linkedHashMap2.keySet());
                    gjT.A02(arrayList5.size());
                    textView.setText(2131975455);
                    Iterator it2 = arrayList5.iterator();
                    while (it2.hasNext()) {
                        C266954ac r2 = (C266954ac) it2.next();
                        int indexOf2 = arrayList5.indexOf(r2);
                        ArrayList arrayList6 = gjT.A0J;
                        View requireViewById4 = ((View) arrayList6.get(indexOf2)).requireViewById(R.id.survey_tombstone_reason_text);
                        0qQ.A07(requireViewById4);
                        TextView textView7 = (TextView) requireViewById4;
                        Object obj4 = linkedHashMap2.get(r2);
                        if (obj4 != null) {
                            textView7.setText(((Number) obj4).intValue());
                            AnonymousClass0fU.A00(new ICG(userSession2, r82, gjT, iUk, r2), (View) arrayList6.get(indexOf2));
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                } else {
                    if (r8 instanceof AnonymousClass3UH) {
                        1UQ r122 = ((AnonymousClass3UH) r8).A05;
                        if (r122 == null) {
                            r122 = 1UQ.A0v;
                        }
                        if (r122 == 1UQ.A0p || r122 == 1UQ.A0t || r122 == 1UQ.A0v || r122 == 1UQ.A0r || r122 == 1UQ.A0n || r122 == 1UQ.A0s) {
                            Context context2 = view2.getContext();
                            int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.hashtags_netego_tombstone_height);
                            DisplayMetrics displayMetrics2 = new DisplayMetrics();
                            Object systemService2 = context2.getSystemService("window");
                            if (systemService2 != null) {
                                ((WindowManager) systemService2).getDefaultDisplay().getMetrics(displayMetrics2);
                                View view6 = gjT.A07;
                                ViewGroup.LayoutParams layoutParams3 = view6.getLayoutParams();
                                layoutParams3.width = displayMetrics2.widthPixels;
                                layoutParams3.height = dimensionPixelSize;
                                view6.setLayoutParams(layoutParams3);
                                0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.feed.ui.state.DismissibleNetegoItemState");
                                C266944ab r73 = (C266944ab) obj2;
                                if (r27 != null) {
                                    1UQ B5J = r8.B5J();
                                    0qQ.A07(B5J);
                                    if (r73.BDD() == C266954ac.CLICKED_HIDE) {
                                        C2363733m.A07(gjT, 8);
                                        C56310HwN.A01(gjT, 8);
                                        switch (B5J.ordinal()) {
                                            case 2:
                                            case 5:
                                            case 7:
                                            case 8:
                                                i2 = 2131964432;
                                                break;
                                            case 10:
                                                i2 = 2131964433;
                                                break;
                                            default:
                                                i2 = 2131964430;
                                                break;
                                        }
                                        TextView textView8 = gjT.A0F;
                                        textView8.setText(i2);
                                        textView8.getPaint().setFakeBoldText(true);
                                        TextView textView9 = gjT.A0E;
                                        textView9.setVisibility(0);
                                        textView9.setText(2131964431);
                                        gjT.A0B.setVisibility(0);
                                        C2363733m.A06(gjT);
                                    }
                                } else {
                                    th = new IllegalArgumentException("Required value was null.");
                                    i = -1338762662;
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    }
                    if (r8 instanceof DHK) {
                        gjT.A02 = this.A00;
                        0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.feed.notes.model.NotesNetegoTrayState");
                        IBM ibm = new IBM((DHK) r8, (C57247IUi) obj2, gjT);
                        Resources resources2 = gjT.A08.getResources();
                        String string3 = resources2.getString(2131968586);
                        0qQ.A07(string3);
                        String string4 = resources2.getString(2131968587);
                        0qQ.A07(string4);
                        Integer num = AnonymousClass05K.A01;
                        gjT.A03(new IAM(gjT), UndoStyle.A04, num, string3, string4);
                        C2363733m.A02(ibm, gjT);
                    } else if (r8 instanceof C274594oe) {
                        gjT.A02 = this.A00;
                        0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.feed.tifu.state.TifuNetegoState");
                        Resources resources3 = gjT.A08.getResources();
                        String string5 = resources3.getString(2131975376);
                        String string6 = resources3.getString(2131975377);
                        UndoStyle undoStyle = UndoStyle.A07;
                        C45446CwZ cwZ = new C45446CwZ(new 1eB((ConfirmationStyle) null, (ConfirmationTitleStyle) null, (C246203eC) null, (MediaOptionStyle) null, (UndoStyle) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (List) null));
                        cwZ.A01 = string5;
                        cwZ.A02 = NetInfoModule.CONNECTION_TYPE_NONE;
                        cwZ.A03 = string6;
                        cwZ.A00 = undoStyle;
                        C2363733m.A01(new IBN((C274594oe) r8, (AnonymousClass5O4) obj2, gjT), cwZ.A00(), userSession2, (1Xj) null, gjT, (AnonymousClass3W1) null);
                        C2363733m.A03(ConfirmationStyle.TOMBSTONE_V2, ConfirmationTitleStyle.LARGE_LEFT, undoStyle, gjT);
                    }
                }
            }
            AnonymousClass0fD.A0A(-684405247, A032);
            return;
        }
        th = new IllegalStateException("Required value was null.");
        i = -49489453;
        AnonymousClass0fD.A0A(i, A032);
        throw th;
    }

    public final void A01(View view, UserSession userSession, AnonymousClass1Xn r11, Object obj) {
        int A032 = AnonymousClass0fD.A03(1578211090);
        0qQ.A0B(userSession, 0);
        0qQ.A0B(view, 1);
        A00(view, (C61079JwH) null, userSession, r11, obj);
        AnonymousClass0fD.A0A(60070574, A032);
    }

    public C2363633l(C2363233h r2, boolean z) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = z;
    }
}
