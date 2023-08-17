package com;


import com.Repository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class RepositoryTest {

    @Mock(strictness = Mock.Strictness.LENIENT)
    private Repository repository;

    @Test
    void allureIssue() {
        when(repository.getReferenceById("id")).thenReturn("Kaixo!");
    }


}
