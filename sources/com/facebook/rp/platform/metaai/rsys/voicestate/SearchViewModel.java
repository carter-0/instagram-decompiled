package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C51975G9x;
import X.DbW;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

public final class SearchViewModel extends AnonymousClass0T0 {
    @SerializedName("attribution_link")
    public final String attributionLink;
    @SerializedName("references_title")
    public final String[] referencesTitle;
    @SerializedName("search_engine")
    public final String searchEngine;
    @SerializedName("search_engine_icon_url")
    public final String searchEngineIconUrl;
    @SerializedName("search_query")
    public final String searchQuery;
    @SerializedName("search_result_uri")
    public final String[] searchResultUri;
    @SerializedName("source_url")
    public final String sourceUrl;

    public SearchViewModel(String[] strArr, String str, String str2, String str3, String[] strArr2, String str4, String str5) {
        DbW.A1N(strArr, 1, strArr2);
        this.searchResultUri = strArr;
        this.searchEngine = str;
        this.searchQuery = str2;
        this.attributionLink = str3;
        this.referencesTitle = strArr2;
        this.searchEngineIconUrl = str4;
        this.sourceUrl = str5;
    }

    public static /* synthetic */ SearchViewModel copy$default(SearchViewModel searchViewModel, String[] strArr, String str, String str2, String str3, String[] strArr2, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            strArr = searchViewModel.searchResultUri;
        }
        if ((i & 2) != 0) {
            str = searchViewModel.searchEngine;
        }
        if ((i & 4) != 0) {
            str2 = searchViewModel.searchQuery;
        }
        if ((i & 8) != 0) {
            str3 = searchViewModel.attributionLink;
        }
        if ((i & 16) != 0) {
            strArr2 = searchViewModel.referencesTitle;
        }
        if ((i & 32) != 0) {
            str4 = searchViewModel.searchEngineIconUrl;
        }
        if ((i & 64) != 0) {
            str5 = searchViewModel.sourceUrl;
        }
        return searchViewModel.copy(strArr, str, str2, str3, strArr2, str4, str5);
    }

    public final String[] component1() {
        return this.searchResultUri;
    }

    public final String component2() {
        return this.searchEngine;
    }

    public final String component3() {
        return this.searchQuery;
    }

    public final String component4() {
        return this.attributionLink;
    }

    public final String[] component5() {
        return this.referencesTitle;
    }

    public final String component6() {
        return this.searchEngineIconUrl;
    }

    public final String component7() {
        return this.sourceUrl;
    }

    public final SearchViewModel copy(String[] strArr, String str, String str2, String str3, String[] strArr2, String str4, String str5) {
        AnonymousClass7TF.A1D(strArr, 0, strArr2);
        return new SearchViewModel(strArr, str, str2, str3, strArr2, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SearchViewModel) {
                SearchViewModel searchViewModel = (SearchViewModel) obj;
                if (!0qQ.A0K(this.searchResultUri, searchViewModel.searchResultUri) || !0qQ.A0K(this.searchEngine, searchViewModel.searchEngine) || !0qQ.A0K(this.searchQuery, searchViewModel.searchQuery) || !0qQ.A0K(this.attributionLink, searchViewModel.attributionLink) || !0qQ.A0K(this.referencesTitle, searchViewModel.referencesTitle) || !0qQ.A0K(this.searchEngineIconUrl, searchViewModel.searchEngineIconUrl) || !0qQ.A0K(this.sourceUrl, searchViewModel.sourceUrl)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String getAttributionLink() {
        return this.attributionLink;
    }

    public final String[] getReferencesTitle() {
        return this.referencesTitle;
    }

    public final String getSearchEngine() {
        return this.searchEngine;
    }

    public final String getSearchEngineIconUrl() {
        return this.searchEngineIconUrl;
    }

    public final String getSearchQuery() {
        return this.searchQuery;
    }

    public final String[] getSearchResultUri() {
        return this.searchResultUri;
    }

    public final String getSourceUrl() {
        return this.sourceUrl;
    }

    public int hashCode() {
        return (((((((((((Arrays.hashCode(this.searchResultUri) * 31) + AnonymousClass7TG.A0E(this.searchEngine)) * 31) + AnonymousClass7TG.A0E(this.searchQuery)) * 31) + AnonymousClass7TG.A0E(this.attributionLink)) * 31) + Arrays.hashCode(this.referencesTitle)) * 31) + AnonymousClass7TG.A0E(this.searchEngineIconUrl)) * 31) + C41845B3m.A00(this.sourceUrl);
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SearchViewModel(searchResultUri=");
        A1A.append(Arrays.toString(this.searchResultUri));
        A1A.append(", searchEngine=");
        A1A.append(this.searchEngine);
        A1A.append(", searchQuery=");
        A1A.append(this.searchQuery);
        A1A.append(", attributionLink=");
        A1A.append(this.attributionLink);
        A1A.append(", referencesTitle=");
        A1A.append(Arrays.toString(this.referencesTitle));
        A1A.append(", searchEngineIconUrl=");
        A1A.append(this.searchEngineIconUrl);
        A1A.append(", sourceUrl=");
        return C51975G9x.A0i(this.sourceUrl, A1A);
    }
}
