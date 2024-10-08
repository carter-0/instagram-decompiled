package X;

import android.app.SearchableInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;

public final class Q9G extends Filter {
    public Tf0 A00;

    public final CharSequence convertResultToString(Object obj) {
        return this.A00.AK1((Cursor) obj);
    }

    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        String charSequence2;
        Cursor cursor;
        String suggestAuthority;
        C7401QBj qBj = (C7401QBj) this.A00;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        SearchView searchView = qBj.A0B;
        Cursor cursor2 = null;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                SearchableInfo searchableInfo = qBj.A09;
                String[] strArr = null;
                if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
                    cursor = null;
                } else {
                    Uri.Builder fragment = Pxe.A0I().scheme("content").authority(suggestAuthority).query("").fragment("");
                    String suggestPath = searchableInfo.getSuggestPath();
                    if (suggestPath != null) {
                        fragment.appendEncodedPath(suggestPath);
                    }
                    fragment.appendPath("search_suggest_query");
                    String suggestSelection = searchableInfo.getSuggestSelection();
                    if (suggestSelection != null) {
                        strArr = new String[]{charSequence2};
                    } else {
                        fragment.appendPath(charSequence2);
                    }
                    fragment.appendQueryParameter("limit", String.valueOf(50));
                    cursor = 0fM.A01(qBj.A0A.getContentResolver(), fragment.build(), suggestSelection, (String) null, (String[]) null, strArr, 1825540651);
                }
                if (cursor != null) {
                    cursor.getCount();
                    cursor2 = cursor;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursor2 != null) {
            filterResults.count = cursor2.getCount();
        } else {
            filterResults.count = 0;
            cursor2 = null;
        }
        filterResults.values = cursor2;
        return filterResults;
    }

    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Tf0 tf0 = this.A00;
        Cursor cursor = ((Q9E) tf0).A02;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            tf0.AGi((Cursor) obj);
        }
    }
}
