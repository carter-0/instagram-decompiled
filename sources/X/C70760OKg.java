package X;

import android.net.Uri;
import com.facebook.react.modules.intent.IntentModule;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.OKg  reason: case insensitive filesystem */
public final class C70760OKg {
    public long A00 = Long.MIN_VALUE;
    public long A01 = Long.MAX_VALUE;
    public final Set A02 = DbS.A0y();

    public final String A00() {
        long j = this.A01;
        long j2 = this.A00;
        Set set = this.A02;
        if (!C66580MXl.A1b(set)) {
            set = null;
        }
        if (set == null) {
            return null;
        }
        try {
            JSONObject A17 = C66580MXl.A17("{\n    \"aggregateList\": [],\n    \"b_constraints\": [\n      []\n    ],\n    \"c_constraints\": [\n      []\n    ],\n    \"cols\": [],\n    \"derivedCols\": [],\n    \"enumCols\": [],\n    \"filterMode\": \"DEFAULT\",\n    \"hideEmptyColumns\": false,\n    \"ignoreGroupByInComparison\": false,\n    \"is_timeseries\": false,\n    \"mappedCols\": [],\n    \"metrik_view_params\": {\n      \"columns_skip_formatting\": [],\n      \"connect_nulls\": true,\n      \"fitToContent\": false,\n      \"height\": \"100%\",\n      \"legend_mode\": \"nongrid\",\n      \"tableID\": \"ls_mci_trace_events_unrestricted\",\n      \"timezone\": \"America/Los_Angeles\",\n      \"timezone_offset\": 480,\n      \"use_y_axis_hints_as_limits\": true,\n      \"width\": \"100%\",\n      \"y_min_hint\": 0\n    },\n    \"modifiers\": [],\n    \"num_samples\": \"100\",\n    \"order\": \"none\",\n    \"order_desc\": true,\n    \"param_dimensions\": [],\n    \"purposes\": [],\n    \"return_remainder\": false,\n    \"sampleCols\": [\n      \"check_point_list\",\n      \"time\",\n      \"trace_id\",\n      \"trace_type\"\n    ],\n    \"samplingRatio\": \"1\",\n    \"should_pivot\": false,\n    \"timezone\": \"America/Los_Angeles\"\n  }");
            String A0g = 002.A0g("[", DbT.A0z(",", set, C74013Pne.A00), "]");
            0qQ.A07(A0g);
            JSONArray jSONArray = new JSONArray();
            JSONObject A11 = DbS.A11();
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            jSONArray.put(A0g);
            A11.put("column", "trace_id");
            A11.put("op", "eq");
            A11.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, jSONArray);
            jSONArray3.put(A11);
            jSONArray2.put(jSONArray3);
            A17.put("constraints", jSONArray2);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
            A17.put("start", simpleDateFormat.format(new Date(j - 86400000)));
            A17.put("end", simpleDateFormat.format(new Date(j2 + 86400000)));
            return new Uri.Builder().scheme("https").authority("www.internalfb.com").appendPath("intern").appendPath("scuba").appendPath("query").appendQueryParameter("dataset", "ls_mci_trace_events_unrestricted").appendQueryParameter("pool", "uber").appendQueryParameter("silica_token", "ScubaTable/ls_mci_trace_events_unrestricted:uber").appendQueryParameter("view", "samples_client").appendQueryParameter("drillstate", A17.toString()).toString();
        } catch (JSONException unused) {
            return null;
        }
    }
}
