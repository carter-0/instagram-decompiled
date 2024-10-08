package com.instagram.direct.appwidget;

import X.002;
import X.00R;
import X.00l;
import X.0eE;
import X.0qQ;
import X.2X1;
import X.2Yu;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass0fU;
import X.AnonymousClass0t1;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C66580MXl;
import X.C66581MXm;
import X.C71072Oar;
import X.C71399Ojy;
import X.C71403Ok2;
import X.C72930PPo;
import X.C72935PPt;
import X.DbS;
import X.DbT;
import X.DbU;
import X.QAL;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.gson.Gson;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class DirectWidgetConfig extends AppCompatActivity {
    public int A00;
    public TextView A01;
    public QAL A02;
    public String A03;
    public String A04;
    public final HashMap A05 = AnonymousClass7TE.A1E();

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.direct.appwidget.DirectWidgetConfig, android.content.Context, androidx.appcompat.app.AppCompatActivity] */
    public final void launchCustomChatSearch(View view) {
        String str;
        0qQ.A0B(view, 0);
        Intent A0A = C66580MXl.A0A(this, DirectRecipientSearchActivity.class);
        View findViewById = findViewById(R.id.custom_chats_list);
        0qQ.A07(findViewById);
        Bundle A0a = AnonymousClass7TE.A0a();
        Object tag = view.getTag();
        if (tag != null) {
            A0a.putString("custom_chat_view_tag", tag.toString());
            View findViewWithTag = findViewById.findViewWithTag(tag);
            0qQ.A0C(findViewWithTag, "null cannot be cast to non-null type android.widget.TextView");
            str = ((TextView) findViewWithTag).getText().toString();
        } else {
            str = null;
        }
        A0a.putString("selected_user_id", this.A03);
        C71072Oar.A01(new C72935PPt(A0A, A0a, this, str), this.A03);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        bundle.putString("config_account_username", this.A04);
        bundle.putString("config_account_user_id", this.A03);
        String A0B = new Gson().A0B(this.A05);
        0qQ.A07(A0B);
        bundle.putString("config_chats_list", A0B);
        DirectWidgetConfig.super.onSaveInstanceState(bundle);
    }

    public static final void A00(DirectWidgetConfig directWidgetConfig) {
        directWidgetConfig.A05.clear();
        A01(directWidgetConfig);
        View findViewById = directWidgetConfig.findViewById(R.id.chat_type);
        0qQ.A07(findViewById);
        ((TextView) findViewById).setText(R.string.f0nameremoved);
        View findViewById2 = directWidgetConfig.findViewById(R.id.custom_chats_list);
        0qQ.A07(findViewById2);
        findViewById2.setVisibility(8);
    }

    public static final void A01(DirectWidgetConfig directWidgetConfig) {
        View findViewById = directWidgetConfig.findViewById(R.id.custom_chats_list);
        0qQ.A07(findViewById);
        for (int i = 1; i < 5; i++) {
            TextView textView = (TextView) findViewById.findViewWithTag(002.A0O("custom_chat_", i));
            if (textView != null) {
                textView.setText(R.string.f0nameremoved);
            }
        }
        Iterator A0s = AnonymousClass7TF.A0s(directWidgetConfig.A05);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            int A0M = AnonymousClass7TE.A0M(A1J.getKey());
            DirectThreadWidgetItem directThreadWidgetItem = (DirectThreadWidgetItem) A1J.getValue();
            TextView textView2 = (TextView) findViewById.findViewWithTag(002.A0O("custom_chat_", A0M + 1));
            if (textView2 != null) {
                textView2.setText(directThreadWidgetItem.A05);
            }
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle extras;
        String string;
        Bundle extras2;
        DirectThreadWidgetItem directThreadWidgetItem;
        Object obj;
        Object key;
        DirectWidgetConfig.super.onActivityResult(i, i2, intent);
        if (i == 100 && i2 == -1) {
            if (intent != null && (extras = intent.getExtras()) != null && (string = extras.getString("custom_chat_view_tag")) != null && (extras2 = intent.getExtras()) != null && (directThreadWidgetItem = (DirectThreadWidgetItem) extras2.getParcelable("direct_widget_custom_chat_info")) != null) {
                View findViewById = findViewById(R.id.custom_chats_list);
                0qQ.A07(findViewById);
                HashMap hashMap = this.A05;
                Set entrySet = hashMap.entrySet();
                0qQ.A07(entrySet);
                Iterator it = entrySet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (0qQ.A0K(((DirectThreadWidgetItem) ((Map.Entry) obj).getValue()).A05, directThreadWidgetItem.A05)) {
                        break;
                    }
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry == null || (key = entry.getKey()) == null) {
                    findViewById.setVisibility(0);
                    hashMap.put(Integer.valueOf(Integer.parseInt(String.valueOf(00R.A00(string))) - 1), directThreadWidgetItem);
                    TextView textView = (TextView) findViewById.findViewWithTag(string);
                    if (textView != null) {
                        textView.setText(directThreadWidgetItem.A05);
                    }
                } else {
                    hashMap.remove(key);
                    TextView textView2 = (TextView) findViewById.findViewWithTag(string);
                    if (textView2 != null) {
                        DbU.A1A(textView2.getResources(), textView2, R.string.f0nameremoved);
                    }
                    if (hashMap.isEmpty()) {
                        findViewById.setVisibility(8);
                    }
                }
                View findViewById2 = findViewById(R.id.chat_type);
                0qQ.A0C(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView3 = (TextView) findViewById2;
                boolean isEmpty = hashMap.isEmpty();
                int i3 = R.string.f0nameremoved;
                if (isEmpty) {
                    i3 = R.string.f0nameremoved;
                }
                textView3.setText(i3);
            } else {
                return;
            }
        }
        QAL qal = this.A02;
        if (qal == null) {
            0qQ.A0F("bottomSheet");
            throw AnonymousClass00P.createAndThrow();
        } else {
            qal.dismiss();
        }
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.instagram.direct.appwidget.DirectWidgetConfig, android.content.Context, java.lang.Object, android.content.ContextWrapper, androidx.appcompat.app.AppCompatActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        String str;
        int i;
        int A002 = AnonymousClass0fD.A00(-992364203);
        DirectWidgetConfig.super.onCreate(bundle);
        setContentView((int) R.layout.direct_app_widget_config);
        this.A02 = new QAL(this);
        boolean z = false;
        if (bundle != null) {
            z = true;
            String string = bundle.getString("config_account_user_id");
            if (string != null) {
                this.A03 = string;
            }
            String string2 = bundle.getString("config_account_username");
            if (string2 != null) {
                this.A04 = string2;
            }
        }
        Bundle A06 = DbU.A06(this);
        if (A06 != null) {
            this.A00 = A06.getInt("appWidgetId", 0);
            View findViewById = findViewById(R.id.widget_settings_header);
            0qQ.A07(findViewById);
            ImageView A0G = DbS.A0G(findViewById, R.id.exit_icon);
            if (A0G != null) {
                Context context = A0G.getContext();
                A0G.setColorFilter(context.getColor(2Yu.A0B(context)), PorterDuff.Mode.SRC_ATOP);
                C71403Ok2.A01(A0G, 40, this);
            }
            View findViewById2 = findViewById(R.id.username);
            0qQ.A07(findViewById2);
            TextView textView = (TextView) findViewById2;
            UserSession A0S = DbS.A0S(this);
            if (A0S instanceof UserSession) {
                Context baseContext = getBaseContext();
                0qQ.A07(baseContext);
                SharedPreferences A07 = C66581MXm.A07(baseContext, this.A00);
                String string3 = A07.getString(002.A0O("com.instagram.direct.appwidget.USER", this.A00), (String) null);
                String string4 = A07.getString(002.A0O("com.instagram.direct.appwidget.USER_ID", this.A00), (String) null);
                if (!z) {
                    if (string4 == null || 00l.A0W(string4)) {
                        A00(this);
                        0eE r2 = AnonymousClass0t1.A01;
                        UserSession userSession = A0S;
                        this.A03 = r2.A01(userSession).getId();
                        string3 = DbU.A0n(userSession, r2);
                    } else {
                        this.A03 = string4;
                    }
                    this.A04 = string3;
                }
                textView.setText(this.A04);
                AnonymousClass0fU.A00(new C71399Ojy(3, A0S, this, textView), textView);
            }
            if (bundle != null) {
                str = bundle.getString("config_chats_list");
            } else {
                str = null;
            }
            View findViewById3 = findViewById(R.id.chat_type);
            0qQ.A07(findViewById3);
            TextView textView2 = (TextView) findViewById3;
            if (this.A04 == null) {
                DbT.A17(this, textView2, R.color.grey_5);
            } else {
                DbT.A17(this, textView2, R.color.badge_color);
                C71072Oar.A01(new C72930PPo(this, str), this.A03);
                View findViewById4 = findViewById(R.id.custom_chats_list);
                0qQ.A07(findViewById4);
                HashMap hashMap = this.A05;
                if (!hashMap.isEmpty()) {
                    findViewById4.setVisibility(0);
                }
                boolean isEmpty = hashMap.isEmpty();
                int i2 = R.string.f0nameremoved;
                if (isEmpty) {
                    i2 = R.string.f0nameremoved;
                }
                textView2.setText(i2);
                AnonymousClass0fU.A00(new C71399Ojy(5, findViewById4, this, textView2), textView2);
            }
            TextView textView3 = (TextView) findViewById(R.id.theme_type);
            this.A01 = textView3;
            if (textView3 != null) {
                int i3 = 2X1.A00;
                if (i3 != 1) {
                    i = R.string.f0nameremoved;
                    if (i3 != 2) {
                        i = R.string.f0nameremoved;
                    }
                } else {
                    i = R.string.f0nameremoved;
                }
                textView3.setText(i);
                String str2 = this.A04;
                TextView textView4 = this.A01;
                if (str2 == null) {
                    if (textView4 != null) {
                        DbT.A17(this, textView4, R.color.grey_5);
                    }
                } else if (textView4 != null) {
                    DbT.A17(this, textView4, R.color.badge_color);
                    TextView textView5 = this.A01;
                    if (textView5 != null) {
                        C71403Ok2.A01(textView5, 47, this);
                    }
                }
            }
            0qQ.A0F("widgetThemeButton");
            throw AnonymousClass00P.createAndThrow();
        }
        Intent A09 = DbS.A09();
        A09.putExtra("appWidgetId", this.A00);
        setResult(0, A09);
        if (this.A00 == 0) {
            finish();
        }
        AnonymousClass0fD.A07(1876568807, A002);
    }
}
