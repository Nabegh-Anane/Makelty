package com.example.makelty.ui.Creation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.makelty.databinding.FragmentCreationBinding;

public class CreateFragment extends Fragment {

    private FragmentCreationBinding binding;
    private CreateViewModel createViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentCreationBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        createViewModel = new ViewModelProvider(this).get(CreateViewModel.class);
        createViewModel.getText().observe(getViewLifecycleOwner(), text -> binding.textCreate.setText(text));

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
