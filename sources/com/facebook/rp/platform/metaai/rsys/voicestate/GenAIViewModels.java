package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import com.google.gson.annotations.SerializedName;

public final class GenAIViewModels extends AnonymousClass0T0 {
    @SerializedName("imagine_view_model")
    public final ImagineViewModel imagineViewModel;
    @SerializedName("reels_view_model")
    public final ReelsViewModel reelsViewModel;
    @SerializedName("search_view_model")
    public final SearchViewModel searchViewModel;

    public final ImagineViewModel component1() {
        return this.imagineViewModel;
    }

    public final ReelsViewModel component2() {
        return this.reelsViewModel;
    }

    public final SearchViewModel component3() {
        return this.searchViewModel;
    }

    public final GenAIViewModels copy(ImagineViewModel imagineViewModel2, ReelsViewModel reelsViewModel2, SearchViewModel searchViewModel2) {
        return new GenAIViewModels(imagineViewModel2, reelsViewModel2, searchViewModel2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GenAIViewModels) {
                GenAIViewModels genAIViewModels = (GenAIViewModels) obj;
                if (!0qQ.A0K(this.imagineViewModel, genAIViewModels.imagineViewModel) || !0qQ.A0K(this.reelsViewModel, genAIViewModels.reelsViewModel) || !0qQ.A0K(this.searchViewModel, genAIViewModels.searchViewModel)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GenAIViewModels copy$default(GenAIViewModels genAIViewModels, ImagineViewModel imagineViewModel2, ReelsViewModel reelsViewModel2, SearchViewModel searchViewModel2, int i, Object obj) {
        if ((i & 1) != 0) {
            imagineViewModel2 = genAIViewModels.imagineViewModel;
        }
        if ((i & 2) != 0) {
            reelsViewModel2 = genAIViewModels.reelsViewModel;
        }
        if ((i & 4) != 0) {
            searchViewModel2 = genAIViewModels.searchViewModel;
        }
        return new GenAIViewModels(imagineViewModel2, reelsViewModel2, searchViewModel2);
    }

    public final ImagineViewModel getImagineViewModel() {
        return this.imagineViewModel;
    }

    public final ReelsViewModel getReelsViewModel() {
        return this.reelsViewModel;
    }

    public final SearchViewModel getSearchViewModel() {
        return this.searchViewModel;
    }

    public int hashCode() {
        return (((AnonymousClass7TG.A0C(this.imagineViewModel) * 31) + AnonymousClass7TG.A0C(this.reelsViewModel)) * 31) + AnonymousClass7TE.A0L(this.searchViewModel);
    }

    public GenAIViewModels(ImagineViewModel imagineViewModel2, ReelsViewModel reelsViewModel2, SearchViewModel searchViewModel2) {
        this.imagineViewModel = imagineViewModel2;
        this.reelsViewModel = reelsViewModel2;
        this.searchViewModel = searchViewModel2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("GenAIViewModels(imagineViewModel=");
        A1A.append(this.imagineViewModel);
        A1A.append(", reelsViewModel=");
        A1A.append(this.reelsViewModel);
        A1A.append(", searchViewModel=");
        return AnonymousClass7TG.A0n(this.searchViewModel, A1A);
    }
}
