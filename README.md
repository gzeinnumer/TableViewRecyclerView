# TableViewRecyclerView
 focus on match parent

<center>
<img src="https://github.com/gzeinnumer/TableViewRecyclerView/blob/master/preview/example1.jpg" width="400"/>
</center>

- activity_main.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    android:orientation="vertical"
    tools:context=".MainActivity">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <TextView
            android:layout_width="80dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="No."
            android:textAlignment="center" />

        <View
            android:layout_width="0.8dp"
            android:layout_height="match_parent"
            android:background="@color/purple_500" />

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_weight="5"
            android:text="Nama"
            android:textAlignment="center" />

        <View
            android:layout_width="0.8dp"
            android:layout_height="match_parent"
            android:background="@color/purple_500" />

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_weight="5"
            android:text="Address"
            android:textAlignment="center" />
    </LinearLayout>

    <androidx.recyclerview.widget.RecyclerView
        android:id="@+id/rv"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />

</LinearLayout>
```

- item.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_marginTop="10dp"
    android:orientation="horizontal">

    <TextView
        android:id="@+id/no"
        android:layout_width="80dp"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:text="No."
        android:textAlignment="center" />

    <View
        android:layout_width="0.8dp"
        android:layout_height="match_parent"
        android:background="@color/purple_500" />

    <TextView
        android:id="@+id/nama"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_weight="5"
        android:paddingStart="8dp"
        android:paddingEnd="8dp"
        android:text="Nama" />

    <View
        android:layout_width="0.8dp"
        android:layout_height="match_parent"
        android:background="@color/purple_500" />

    <TextView
        android:id="@+id/address"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_weight="5"
        android:paddingStart="8dp"
        android:paddingEnd="8dp"
        android:text="Address" />

</LinearLayout>
```

---

```
Copyright 2020 M. Fadli Zein
```