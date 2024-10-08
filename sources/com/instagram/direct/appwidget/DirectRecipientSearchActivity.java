package com.instagram.direct.appwidget;

import X.00k;
import X.00l;
import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C67685MsN;
import X.C71072Oar;
import X.C71483OlY;
import X.C72929PPn;
import X.C74236PrP;
import X.DbU;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import com.instagram.android.R;
import java.util.ArrayList;

public final class DirectRecipientSearchActivity extends AppCompatActivity implements C74236PrP {
    public ListView A00;
    public C67685MsN A01;
    public String A02;
    public String A03 = "";
    public String A04 = "";
    public final ArrayList A05 = AnonymousClass7TE.A1C();
    public final ArrayList A06 = AnonymousClass7TE.A1C();

    /* JADX WARNING: type inference failed for: r5v0, types: [android.content.Context, com.instagram.direct.appwidget.DirectRecipientSearchActivity, androidx.appcompat.app.AppCompatActivity] */
    public final boolean onCreateOptionsMenu(Menu menu) {
        0qQ.A0B(menu, 0);
        getMenuInflater().inflate(R.menu.menu, menu);
        MenuItem findItem = menu.findItem(R.id.search_bar);
        0qQ.A07(findItem);
        findItem.setVisible(true);
        View actionView = findItem.getActionView();
        0qQ.A0C(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
        SearchView searchView = (SearchView) actionView;
        searchView.setQueryHint(getResources().getString(R.string.f0nameremoved));
        searchView.setIconifiedByDefault(false);
        searchView.requestFocus();
        searchView.setMaxWidth(Integer.MAX_VALUE);
        searchView.A04 = new C71483OlY(this);
        return true;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.direct.appwidget.DirectRecipientSearchActivity, java.lang.Object, androidx.appcompat.app.AppCompatActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String string;
        int A002 = AnonymousClass0fD.A00(1298327125);
        DirectRecipientSearchActivity.super.onCreate(bundle);
        setContentView((int) R.layout.direct_recipient_search_fragment);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("current_custom_chat_list");
        if (stringArrayListExtra != null) {
            this.A05.addAll(00k.A0a(stringArrayListExtra));
        }
        Bundle A062 = DbU.A06(this);
        String str3 = "";
        if (A062 == null || (str = A062.getString("current_custom_chat_id")) == null) {
            str = str3;
        }
        this.A03 = str;
        if (!(A062 == null || (string = A062.getString("selected_user_id")) == null)) {
            str3 = string;
        }
        this.A04 = str3;
        if (A062 == null || (str2 = A062.getString("custom_chat_view_tag")) == null) {
            str2 = "custom_chat_1";
        }
        this.A02 = str2;
        this.A00 = (ListView) findViewById(R.id.recipients);
        if (!00l.A0W(this.A04)) {
            C71072Oar.A01(new C72929PPn(this, 0), this.A04);
        }
        AnonymousClass0fD.A07(-1040586186, A002);
    }
}
